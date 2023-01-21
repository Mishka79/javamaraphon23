package day6;

import java.util.Random;

public class Teacher {
    private String Name;
    private String Predmet;

    public Teacher(String name, String predmet) {
        Name = name;
        Predmet = predmet;
    }

    public String getName() {        return Name;    }

    public String getPredmet() {        return Predmet;    }
    public void evaluate(Student student1) {
        Random rand = new Random();
        String otmetka = new String();
        switch (rand.nextInt(4)+2){
            case 2:
              otmetka="неудовлетворительно";
              break;
            case 3:
              otmetka="удовлетворительно";
              break;
            case 4:
                otmetka="хорошо";
              break;
            case 5:
                otmetka="отлично";
              break;
        }
        System.out.println("Преподаватель "+ this.Name+ " оценил студента с именем "+ student1.getName()+ " по предмету "+ this.Predmet+" на оценку "+otmetka);
    }
}
