package day6;

public class Task1 {
    public static void main(String[] args) {
    Car car1 = new Car();
    car1.SetModel("Lamborgini");
    car1.SetColor("Orange");
    car1.setYear(1979);
    day6.Motorbike motorbike1= new Motorbike("Honda","Red",2023);
    car1.info();
    motorbike1.info();
    System.out.println(car1.yearDifference(1966));
    System.out.println(motorbike1.yearDifference(2035));
    }
}
