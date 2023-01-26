package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String predmet;

    public Teacher(String name, String predmet) {
        this.name = name;
        this.predmet = predmet;
    }

    public String getName() {
        return name;
    }

    public String getPredmet() {
        return predmet;
    }

    public void evaluate(Student student1) {
        Random rand = new Random();
        String otmetka = new String();
        switch (rand.nextInt(4) + 2) {
            case 2:
                otmetka = "неудовлетворительно";
                break;
            case 3:
                otmetka = "удовлетворительно";
                break;
            case 4:
                otmetka = "хорошо";
                break;
            case 5:
                otmetka = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student1.getName() + " по предмету " + this.predmet + " на оценку " + otmetka);
    }
}
