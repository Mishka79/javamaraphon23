package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    public static final int HEALF1 = 25;
    public static final int HEALF2 = 10;

    public Paladin() {

        physAtt = 15;
        physDef = 50;
        magicDef = 20;
    }

    @Override
    public void healHimself() {
        if (healh + HEALF1 < MAX_HEALPH) {
            healh += HEALF1;
        } else {
            healh = MAX_HEALPH;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.healh + HEALF2 < MAX_HEALPH) {
            hero.healh += HEALF2;
        } else {
            hero.healh = MAX_HEALPH;
        }
    }


    public String toString() {
        return "Paladin{health=" + healh + "}";
    }
}
