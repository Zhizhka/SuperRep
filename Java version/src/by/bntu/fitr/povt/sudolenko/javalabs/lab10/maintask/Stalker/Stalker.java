package by.bntu.fitr.povt.sudolenko.javalabs.lab10.maintask.Stalker;

import by.bntu.fitr.povt.sudolenko.javalabs.lab10.maintask.Monster.Monster;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.maintask.Robot.Robot;

public class Stalker
{
    public double armor, hp;
    double damage, ammunition, granate;
    public Stalker(double hp, double damage, double ammunition, double armor, double granate)
    {
        this.hp = hp;
        this.damage = damage;
        this.ammunition = ammunition;
        this.armor = armor;
        this.granate = granate;
    }
    public void attack(Monster object)
    {
        if (this.ammunition <= 0)
        {
            this.ammunition = 0;
            object.hp -= 0;
            System.out.println("There is no any ammunition\n");
        }
        else
        {
            object.hp -= this.damage;
            this.ammunition -= 1;
        }
    }
    public void attack(Robot object)
    {
        if (this.ammunition <= 0)
        {
            this.ammunition = 0;
            object.hp -= 0;
            System.out.println("There is no any ammunition\n");
        }
        else
        {
            object.hp -= this.damage * 0.25;
            if (object.shield >= this.damage * 0.75)
            {
                object.shield -= this.damage * 0.75;
            }
            else
            {
                object.shield = 0;
                object.hp -= (this.damage * 0.75 - object.shield);
            }
            this.ammunition -= 1;
        }
    }
    public void skill(Monster object)
    {
        if (this.ammunition <= 0)
        {
            this.ammunition = 0;
            object.hp -= 0;
            System.out.println("There is no any ammunition\n");
        }
        else
        {
            object.hp -= this.granate;
            this.ammunition -= 10;
        }
    }
    public void skill(Robot object)
    {
        if (this.ammunition <= 0)
        {
            this.ammunition = 0;
            object.hp -= 0;
            System.out.println("There is no any ammunition\n");
        }
        else
        {
            object.hp -= this.granate * 0.25;
            if (object.shield >= this.granate * 0.75) {
                object.shield -= this.granate * 0.75;
            } else {
                object.shield = 0;
                object.hp -= (this.granate * 0.75 - object.shield);
            }
            this.ammunition -= 10;
        }
    }
    public void showinfo()
    {
        System.out.println("Hp :"+this.hp+"\nArmor :"+this.armor+"\nAmmunition: "+this.ammunition+"\n");
    }

}
