package by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.entitis;

public class Robot {

    private double shield;
    private double hp;
    private double energy;
    private double damage;
    private static final int PRICE;

    {
        hp = 150;
        damage = 25;
        shield = 100;
        energy = 50;
    }

    static {
        PRICE = 25;
    }

    public Robot(){
    }

    public Robot(double hp, double damage, double shield, double energy) {
        this.damage = damage;
        this.energy = energy;
        this.hp = hp;
        this.shield = shield;
    }

    public double getHp(){return hp;}

    public void setHp(double hp){this.hp = hp;}

    public double getDamage(){return damage;}

    public double getShield(){return shield;}

    public void setShield(double shield){this.shield = shield;}

    public double getEnergy(){return energy;}

    public static int getPrice(){return PRICE;}

    @Override
    public String toString(){
        return "\nHp: " + hp + "\nDamage: " + damage + "\nShield: " + shield + "\nEnergy: " + energy
                + "\nPrice" + PRICE;
    }

    public void attack(Zombi zombi) {
        double hp = zombi.getHp();
        zombi.setHp(hp - damage);
    }

    public void skill() {
        shield += energy;
    }
}
