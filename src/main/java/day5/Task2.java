package day5;


public class Task2 {
    public static void main(String[] args) {
    Motorbike Motorbike1= new Motorbike("Honda","Red",2023);
        System.out.println(Motorbike1.GetModel());
        System.out.println(Motorbike1.GetColor());
        System.out.println(Motorbike1.GetYear());
    }
}
class Motorbike{
    private String model;
    private String color;
    private int year;
    public Motorbike(String model,String color,int year)
    {
        this.model=model;
        this.color=color;
        this.year=year;
    }
    public String GetModel() {return model;}
    public String GetColor() {return color;}
    public int GetYear() {return year;}
}