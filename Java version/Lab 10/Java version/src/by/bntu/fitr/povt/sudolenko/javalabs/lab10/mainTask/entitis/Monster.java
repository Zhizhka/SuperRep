package by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.entitis;

public class Monster {
    private double hp;
    private double damage;
    private double regeneration;
    private double superRegeneration;
    private static final int PRICE;

    {
        hp = 200;
        damage = 30;
        regeneration = 5;
        superRegeneration = 50;
    }

    static {
        PRICE = 15;
    }

    public Monster(){
    }

    public Monster(double hp, double damage, double regeneration, double superRegeneration) {
        this.hp = hp;
        this.damage = damage;
        this.regeneration = regeneration;
        this.superRegeneration = superRegeneration;
    }

    public double getHp(){return hp;}

    public void setHp(double hp){this.hp = hp;}

    public double getDamage(){return damage;}

    public double getRegeneration(){return regeneration;}

    public double getSuperRegeneration(){return superRegeneration;}

    public static int getPrice(){return PRICE;}

    @Override
    public String toString(){
        return "\nHp: " + hp + "\nDamage: " + damage + "\nPassive regeneration: " + regeneration
                + "\nSkill super regeneration: " + superRegeneration + "\nPrice" + PRICE;
    }

    public void attack(Zombi zombi) {
        double hp = zombi.getHp();
        zombi.setHp(hp - damage);
    }

    public void skill() {
        hp += superRegeneration;
    }

    public void regenerating() {
        hp += regeneration;
    }
}
