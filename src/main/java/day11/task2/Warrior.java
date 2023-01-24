package day11.task2;

public class Warrior extends Hero implements PhysAttack{
    public Warrior() {
        healh=100;
        physAtt=30;
        magicAtt=0;
        physDef=80;
        magicDef=0;
    }

    @Override
    public void physicalAttack(Hero hero) {
        if ((physAtt-physAtt*hero.physDef/100)-hero.healh<=MINHEALPH) {
        hero.healh-=(physAtt-physAtt*hero.physDef/100);}
        else hero.healh=MINHEALPH;

    }
    public String toString() {
        return "Warrior{Health="+healh+"}";
    }



    }

