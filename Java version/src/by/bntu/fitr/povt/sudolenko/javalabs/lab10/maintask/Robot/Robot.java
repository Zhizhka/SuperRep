package by.bntu.fitr.povt.sudolenko.javalabs.lab10.maintask.Robot;

import by.bntu.fitr.povt.sudolenko.javalabs.lab10.maintask.Monster.Monster;
import by.bntu.fitr.povt.sudolenko.javalabs.lab10.maintask.Stalker.Stalker;

public class Robot{

    public double shield, hp;
    double energy, damage, ammunition;
    public Robot(double hp,double damage,double ammunition,double shield, double energy)
    {
        this.ammunition = ammunition;
        this.damage = damage;
        this.energy = energy;
        this.hp = hp;
        this.shield = shield;
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
    public void attack(Stalker object)
    {
        if (this.ammunition <= 0)
        {
            this.ammunition = 0;
            object.hp -= 0;
            System.out.println("There is no any ammunition\n");
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
            this.ammunition -= 1;
        }
    }
    public void skill()
    {
        this.shield += this.energy;
    }
    public void showinfo()
    {
        System.out.println("Hp :"+this.hp+"\nShield :"+this.shield+"\nAmmunition: "+this.ammunition+"\n");
    }
}
