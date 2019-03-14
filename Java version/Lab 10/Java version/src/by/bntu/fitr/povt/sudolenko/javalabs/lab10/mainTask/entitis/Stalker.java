package by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.entitis;

public class Stalker {
    private double armor;
    private double hp;
    private double damage;
    private double granate;
    private static final int PRICE;

    {
        hp = 100;
        damage = 20;
        armor = 30;
        granate = 100;
    }

    static {
        PRICE = 20;
    }

    public Stalker(){
    }

    public Stalker(double hp, double damage, double armor, double granate) {
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
        this.granate = granate;
    }

    public double getHp(){return hp;}

    public void setHp(double hp){this.hp = hp;}

    public double getDamage(){return damage;}

    public double getArmor(){return armor;}

    public void setArmor(double armor){this.armor = armor;}

    public double getGranate(){return granate;}

    public static int getPrice(){return PRICE;}

    @Override
    public String toString(){
        return "\nHp: " + hp + "\nDamage: " + damage + "\nArmor: " + armor + "\nSkill granate: " + granate
                + "\nPrice" + PRICE;
    }

    public void attack(Zombi zombi) {
        double hp = zombi.getHp();
        zombi.setHp(hp - damage);
    }

    public void skill(Zombi zombi) {
        double hp = zombi.getHp();
        zombi.setHp(hp - granate);
    }
}
