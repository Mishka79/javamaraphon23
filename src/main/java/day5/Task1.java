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
    class Car {
        private String model;
        private String color;
        private int year;
        public void SetModel(String model){ this.model=model; }
        public void SetColor(String color){ this.color=color; }
        public void SetYear(int year){ this.year=year; }
        public  String GetModel(){ return model;}
        public String GetColor(){return color;}
        public int GetYear(){return year;}
    }

