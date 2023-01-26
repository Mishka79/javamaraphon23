package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    private double magicAtt;

    public Magician() {

        physAtt = 5;
        magicAtt = 20;
        magicDef = 80;
        physDef = 0;
    }

    @Override
    public void magicalAttack(Hero hero) {
        if ((magicAtt - magicAtt * hero.magicDef / PROCENT) - hero.healh <= MINHEALPH) {
            hero.healh -= (magicAtt - magicAtt * hero.magicDef / PROCENT);
        } else hero.healh = MINHEALPH;
    }


    public String toString() {
        return "Magician{health=" + healh + "}";
    }
}
