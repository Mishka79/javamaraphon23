package day11.task2;

public class Paladin extends Hero implements PhysAttack,Healer{
    public static final int HEALF1=25;
    public static final int HEALF2=10;

    public Paladin() {
        healh=100;
        physAtt=15;
        magicAtt=0;
        physDef=50;
        magicDef=20;
    }

    @Override
    public void healHimself() {
        if (healh+HEALF1<MAXHEALPH) {healh+=HEALF1;}
        else {healh=MAXHEALPH;}
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.healh+HEALF2<MAXHEALPH) {hero.healh+=HEALF2;}
        else {hero.healh=MAXHEALPH;}
    }

    @Override
    public void physicalAttack(Hero hero) {
        if ((physDef-physAtt*hero.physDef/100)-hero.healh<=MINHEALPH) {
            hero.healh-=(physAtt-physAtt*hero.physDef/100);}
        else hero.healh=MINHEALPH;
    }
    public String toString() {
        return "Paladin{health="+healh+"}";
    }
}
