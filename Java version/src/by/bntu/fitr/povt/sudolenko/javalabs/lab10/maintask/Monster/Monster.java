package by.bntu.fitr.povt.sudolenko.javalabs.lab10.maintask.Monster;

import by.bntu.fitr.povt.sudolenko.javalabs.lab10.maintask.Robot.Robot;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.maintask.Stalker.Stalker;

public class Monster {
    public double hp;
    double damage, power, regeneration, superreg;
    public Monster(double hp, double damage, double power, double regeneration, double superreg)
    {
        this.hp = hp;
        this.damage = damage;
        this.power = power;
        this.regeneration = regeneration;
        this.superreg = superreg;
    }
    public void attack(Stalker object)
    {
        if (this.power <= 0)
        {
            this.power = 0;
            object.hp -= 0;
            System.out.println("There is no any power\n");
        }
        else
        {
            object.hp -= this.damage * 0.35;
            if (object.armor >= this.damage * 0.65) {
                object.armor -= this.damage * 0.65;
            } else {
                object.armor = 0;
                object.hp -= (this.damage * 0.65 - object.armor);
            }
            this.power -= 1;
        }
    }
    public void attack(Robot object)
    {
        if (this.power <= 0)
        {
            this.power = 0;
            object.hp -= 0;
            System.out.println("There is no any power\n");
        }
        else
        {
            object.hp -= this.damage * 0.25;
            if (object.shield >= this.damage * 0.75) {
                object.shield -= this.damage * 0.75;
            } else {
                object.shield = 0;
                object.hp -= (this.damage * 0.75 - object.shield);
            }
            this.power -= 1;
        }
    }
    public void skill()
    {
        if (this.power <= 0)
        {
            this.power = 0;
            this.hp += 0;
            System.out.println("There is no any power\n");
        }
        else
        {
            this.hp += this.superreg;
            this.power -= 10;
        }
    }
    public void regen()
    {
        if (this.power <= 0)
        {
            this.power = 0;
            this.hp += 0;
        }
        else
        {
            this.hp += this.regeneration;
            this.power -= 1;
        }
    }
    public void showinfo()
    {
        System.out.println("Hp :"+this.hp+"\nPower :"+this.power+"\n");
    }
}
