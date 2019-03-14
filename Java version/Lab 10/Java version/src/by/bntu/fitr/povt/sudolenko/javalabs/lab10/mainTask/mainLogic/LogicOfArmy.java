package by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.mainLogic;

import by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.container.HeroArmy;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.controller.Main;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.entitis.Monster;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.entitis.Robot;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.entitis.Stalker;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.userInput.Input;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.view.Printer;

public class LogicOfArmy {
    public static int numberOfUnit;

    public static void chooseForBuy() {
        Robot robot = new Robot();
        Monster monster = new Monster();
        Stalker stalker = new Stalker();
        Printer.print("\nWelcome to the buy menu, there you can buy units for your army!" + "\nNow you have "
                + Main.numOfGold + " money and " + Main.numOfUnitsInArmy + " units");
        Printer.print("\nPlease, choose units for your army:" + "\n\n1 - Robot: " + robot.toString()
                + "\n\n2 - Stalker: " + stalker.toString() + "\n\n3 - Monster: " + monster.toString()
                + "\n\n4 - Your own robot\nPrice - 250" + "\n\n5 - Your own stalker" "\nelse - exit buy menu");
        numberOfUnit = Input.readInt();
        int stalkersPrice = Stalker.getPrice();
        int robotsPrice = Robot.getPrice();
        int monstersPrice = Monster.getPrice();
        switch (numberOfUnit) {
            case 1:
                if (Main.numOfGold < robotsPrice) {
                    Printer.print("\nYou can't buy this unit(not enough money).");
                    chooseForBuy();
                }
                HeroArmy.addToArmy(numberOfUnit);
                Main.numOfGold -= robotsPrice;
                Main.numOfUnitsInArmy += 1;
                chooseForBuy();
            case 2:
                if (Main.numOfGold < stalkersPrice) {
                    Printer.print("\nYou can't buy this unit(not enough money).");
                    chooseForBuy();
                }
                HeroArmy.addToArmy(numberOfUnit);
                Main.numOfGold -= stalkersPrice;
                Main.numOfUnitsInArmy += 1;
                chooseForBuy();
            case 3:
                if (Main.numOfGold < monstersPrice) {
                    Printer.print("\nYou can't buy this unit(not enough money).");
                    chooseForBuy();
                }
                HeroArmy.addToArmy(numberOfUnit);
                Main.numOfGold -= monstersPrice;
                Main.numOfUnitsInArmy += 1;
                chooseForBuy();
            default:
                break;
        }
    }
}
