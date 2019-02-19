package by.bntu.fitr.povt.sudolenko.javalabs.lab10.maintask.Controller;

import by.bntu.fitr.povt.sudolenko.javalabs.lab10.maintask.Robot.Robot;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.maintask.Stalker.Stalker;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.maintask.Monster.Monster;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Stalker stalker = new Stalker(100, 20, 30, 100, 50);
        Monster monster = new Monster(190, 30, 50, 5, 50);
        Robot robot = new Robot(150, 25, 20, 100, 20);
        int count = 2;
        while ((stalker.hp > 0 && robot.hp > 0) || (stalker.hp > 0 && monster.hp > 0) || (robot.hp > 0 && monster.hp > 0))
        {
            count += 1;
            monster.regen();
            if (count % 3 == 0)
            {
                if (stalker.hp > 0)
                {
                    System.out.println("Stalkers turn\n");
                    switch (menu1(scanner)) {
                        case 1:
                            stalker.attack(robot);
                            robot.showinfo();
                            break;
                        case 2:
                            stalker.attack(monster);
                            monster.showinfo();
                            break;
                        case 3:
                            stalker.skill(robot);
                            robot.showinfo();
                            break;
                        case 4:
                            stalker.skill(monster);
                            monster.showinfo();
                            break;
                        default:
                            System.out.println("Wrong number\n");
                            break;
                    }
                }
            }
            else if (count % 3 == 1)
            {
                if (robot.hp > 0)
                {
                    System.out.println("Robots turn\n");
                    switch (menu2(scanner)) {
                        case 1:
                            robot.attack(stalker);
                            stalker.showinfo();
                            break;
                        case 2:
                            robot.attack(monster);
                            monster.showinfo();
                            break;
                        case 3:
                            robot.skill();
                            robot.showinfo();
                            break;
                        default:
                            System.out.println("Wrong number\n");
                            break;
                    }
                }
            }
            else
            {
                if (monster.hp > 0)
                {
                    System.out.println("Monsters turn\n");
                    switch (menu3(scanner)) {
                        case 1:
                            monster.attack(stalker);
                            stalker.showinfo();
                            break;
                        case 2:
                            monster.attack(robot);
                            robot.showinfo();
                            break;
                        case 3:
                            monster.skill();
                            monster.showinfo();
                            break;
                        default:
                            System.out.println("Wrong number\n");
                            break;
                    }
                }
            }
        }
        if(stalker.hp < 0 && robot.hp < 0)
        {
            System.out.println("Monster win\n");
        }
        else if(monster.hp < 0 && robot.hp < 0)
        {
            System.out.println("Stalker win\n");
        }
        else if(stalker.hp < 0 && monster.hp < 0)
        {
            System.out.println("Robot win\n");
        }
    }
    public static int menu1(Scanner scanner)
    {
        System.out.println("1.Attack Robot\n2.Attack Monster\n3.Use Granate on Robot\n" +
                "4.Use Granate on Monster\n");
        int ans = scanner.nextInt();
        return ans;
    }
    public static int menu2(Scanner scanner)
    {
        System.out.println("1.Attack Stalker\n2.Attack Monster\n3.Update the Shield\n");
        int ans = scanner.nextInt();
        return ans;
    }
    public static int menu3(Scanner scanner)
    {
        System.out.println("1.Attack Stalker\n2.Attack Robot\n3.Regenerate hp\n");
        int ans = scanner.nextInt();
        return ans;
    }
}
