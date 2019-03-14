package by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.container;

import by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.entitis.Monster;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.entitis.Robot;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.entitis.Stalker;

public class HeroArmy {
    private static Stalker[] stalkersArmy = new Stalker[3];
    private static Monster[] monstersArmy = new Monster[3];
    private static Robot[] robotsArmy = new Robot[3];
    private static int stalkersCount = 0;
    private static int monstersCount = 0;
    private static int robotsCount = 0;

    public static void addToArmy(int numberOfUnit) {
        if (numberOfUnit == 1) {
            if (robotsCount == robotsArmy.length) {
                Robot[] newRobotsArmy = new Robot[robotsArmy.length * 2];
                System.arraycopy(robotsArmy, 0, newRobotsArmy, 0, robotsArmy.length);
                robotsArmy = newRobotsArmy;
            }
            robotsArmy[robotsCount] = new Robot();
            robotsCount += 1;
        } else if (numberOfUnit == 2) {
            if (stalkersCount == stalkersArmy.length) {
                Stalker[] newStalkersArmy = new Stalker[stalkersArmy.length * 2];
                System.arraycopy(stalkersArmy, 0, newStalkersArmy, 0, stalkersArmy.length);
                stalkersArmy = newStalkersArmy;
            }
            stalkersArmy[stalkersCount] = new Stalker();
            stalkersCount += 1;
        } else {
            if (monstersCount == monstersArmy.length) {
                Monster[] newMonstersArmy = new Monster[monstersArmy.length * 2];
                System.arraycopy(monstersArmy, 0, newMonstersArmy, 0, monstersArmy.length);
                monstersArmy = newMonstersArmy;
            }
            monstersArmy[monstersCount] = new Monster();
            monstersCount += 1;
        }
    }
}
