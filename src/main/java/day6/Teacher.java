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
        int otmetka;
        Random rand = new Random();
       // otmetka=rand.nextInt(4)+2;

        switch (rand.nextInt(4)+2){
            case 2:
              System.out.println("Преподаватель "+ this.Name+ " оценил студента с именем "+ student1.getName()+ " по предмету "+ this.Predmet+" на оценку неудовлетворительно");
              break;
            case 3:
              System.out.println("Преподаватель "+ this.Name+ " оценил студента с именем "+ student1.getName()+ " по предмету "+ this.Predmet+" на оценку удовлетворительно");
              break;
            case 4:
              System.out.println("Преподаватель "+ this.Name+ " оценил студента с именем "+ student1.getName()+ " по предмету "+ this.Predmet+" на оценку хорошо");
              break;
            case 5:
              System.out.println("Преподаватель "+ this.Name+ " оценил студента с именем "+ student1.getName()+ " по предмету "+ this.Predmet+" на оценку отлично");
              break;
        }
    }
}
