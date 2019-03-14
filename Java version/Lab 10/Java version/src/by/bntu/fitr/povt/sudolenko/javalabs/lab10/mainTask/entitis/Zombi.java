package by.bntu.fitr.povt.sudolenko.javalabs.lab10.mainTask.entitis;

public class Zombi {
    private double hp;
    private double damage;
    private static final double COEFFICIENT_OF_DAMAGE_FOR_STALKERS_HP = 0.35;
    private static final double COEFFICIENT_OF_DAMAGE_FOR_STALKERS_ARMOR = 0.65;
    private static final double COEFFICIENT_OF_DAMAGE_FOR_ROBOTS_HP = 0.25;
    private static final double COEFFICIENT_OF_DAMAGE_FOR_ROBOTS_SHIELD = 0.75;
    private static final int PRICE;

    {
        hp = 120;
        damage = 10;
    }

    static {
        PRICE = 10;
    }

    public Zombi(){
    }

    public double getHp(){return hp;}

    public void  setHp(double hp){this.hp = hp;}

    public double getDamage(){return damage;}

    public static int getPrice(){return PRICE;}

    @Override
    public String toString(){
        return "\nHp: " + hp + "\nDamage: " + damage + "\nPrice" + PRICE;
    }

    public void attack(Stalker stalker) {
        double hp = stalker.getHp();
        double armor = stalker.getArmor();
        stalker.setHp(hp - damage * COEFFICIENT_OF_DAMAGE_FOR_STALKERS_HP);
        if (armor >= damage * COEFFICIENT_OF_DAMAGE_FOR_STALKERS_ARMOR) {
            stalker.setArmor(armor - damage * COEFFICIENT_OF_DAMAGE_FOR_STALKERS_ARMOR);
        } else {
            stalker.setArmor(0);
            stalker.setHp(hp - (damage * COEFFICIENT_OF_DAMAGE_FOR_STALKERS_ARMOR - armor));
        }
    }


    public void attack(Robot robot) {
        double hp = robot.getHp();
        double shield = robot.getShield();
        robot.setHp(hp - damage * COEFFICIENT_OF_DAMAGE_FOR_ROBOTS_HP);
        if (shield >= damage * COEFFICIENT_OF_DAMAGE_FOR_ROBOTS_SHIELD) {
            robot.setShield(shield - damage * COEFFICIENT_OF_DAMAGE_FOR_ROBOTS_SHIELD);
        } else {
            robot.setShield(0);
            robot.setHp(hp - (damage * COEFFICIENT_OF_DAMAGE_FOR_ROBOTS_SHIELD - shield));
        }
    }

    public void attack(Monster monster) {
        double x = monster.getHp() - damage;
        monster.setHp(x);
    }
}
