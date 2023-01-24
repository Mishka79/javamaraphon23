package day11.task2;

public class Magician extends Hero implements PhysAttack,MagicAttack{
    public Magician() {
        healh=100;
        physAtt=5;
        magicAtt=20;
        magicDef=80;
        physDef=0;
    }

    @Override
    public void magicalAttack(Hero hero) {
        if ((magicAtt-magicAtt*hero.magicDef/100)-hero.healh<=MINHEALPH) {
            hero.healh-=(magicAtt-magicAtt*hero.magicDef/100);}
        else hero.healh=MINHEALPH;
    }



    @Override
    public void physicalAttack(Hero hero) {
        if ((physDef-physAtt*hero.physDef/100)-hero.healh<=MINHEALPH) {
            hero.healh-=(physAtt-physAtt*hero.physDef/100);}
        else hero.healh=MINHEALPH;
    }

    public String toString() {
        return "Magician{health="+healh+"}";
    }
}
