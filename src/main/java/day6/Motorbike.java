package day6;

import static java.lang.Math.abs;

public class Motorbike {
    private String model;
    private String color;
    private int year;
    public Motorbike(String model, String color, int year)
    {
        this.model=model;
        this.color=color;
        this.year=year;
    }
    public String GetModel() {return model;}
    public String GetColor() {return color;}
    public int GetYear() {return year;}
    public void info() { System.out.println("Это мотоцикл"); };
    public int yearDifference (int inputYear){
        return abs(inputYear-this.year);}
}
