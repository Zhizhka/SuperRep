package by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.view;

import by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.entitis.Monster;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.entitis.Robot;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.entitis.Stalker;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.entitis.Zombi;

public class Printer {
    public static void print(String massage){
        System.out.println("\n" + massage);
    }
    public static void showInformationAboutEntity(Monster monster){
        double hp = monster.getHp();
        print("\nHp: " + hp);
    }
    public static void showInformationAboutEntity(Robot robot){
        double hp = robot.getHp();
        double shield = robot.getShield();
        print("\nHp: " + hp + "\nShield: " + shield);
    }
    public static void showInformationAboutEntity(Stalker stalker){
        double hp = stalker.getHp();
        double armor = stalker.getArmor();
        print("\nHp: " + hp + "\nArmor: " + armor);
    }
    public static void showInformationAboutEntity(Zombi zombi){
        double hp = zombi.getHp();
        print("\nHp: " + hp);
    }
}
