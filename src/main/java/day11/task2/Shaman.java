package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private double magicAtt;
    public static final int HEALF1 = 50;
    public static final int HEALF2 = 30;

    public Shaman() {

        physAtt = 10;
        magicAtt = 15;
        physDef = 20;
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

    @Override
    public void magicalAttack(Hero hero) {
        if ((magicAtt - magicAtt * hero.magicDef / PROCENT) - hero.healh <= MINHEALPH) {
            hero.healh -= (magicAtt - magicAtt * hero.magicDef / PROCENT);
        } else hero.healh = MINHEALPH;
    }


    @Override


    public String toString() {
        return "Shaman{health=" + healh + "}";
    }
}
