package day11.task2;

public class Shaman extends Hero implements PhysAttack,MagicAttack,Healer{
    public static final int HEALF1=50;
    public static final int HEALF2=30;
    public Shaman() {
        healh=100;
        physAtt=10;
        magicAtt=15;
        physDef=20;
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
        return "Shaman{health="+healh+"}";
    }
}
