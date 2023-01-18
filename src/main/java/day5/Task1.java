package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.SetModel("Lamborgini");
        car1.SetColor("Orange");
        car1.SetYear(1979);
        System.out.println(car1.GetModel());
        System.out.println(car1.GetColor());
        System.out.println(car1.GetYear());
    }
}