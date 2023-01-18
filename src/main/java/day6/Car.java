package day6;

import static java.lang.Math.abs;

public class Car {
    private String model;
    private String color;
    private int year;
    public void SetModel(String model){ this.model=model; }
    public void SetColor(String color){ this.color=color; }
    public void setYear(int year){ this.year=year; }
    public  String GetModel(){ return model;}
    public String GetColor(){return color;}
    public int GetYear(){return year;}
    public void info(){  System.out.println("Это автомобиль");   }
    public int yearDifference(int inputYear){
        return abs(inputYear-this.year);
    }
}
