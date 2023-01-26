package day11.task2;

public abstract class Hero implements PhysAttack {
    double healh;
    double physAtt;
    public static final int PROCENT = 100;
    double physDef;
    double magicDef;
    public static final int MAX_HEALPH = 100;
    public static final int MINHEALPH = 0;

    public Hero() {
        this.healh = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        if ((physAtt - physAtt * hero.physDef / PROCENT) - hero.healh <= MINHEALPH) {
            hero.healh -= (physAtt - physAtt * hero.physDef / PROCENT);
        } else {
            hero.healh = MINHEALPH;
        }
    }
}
