package day9.Task2;

import static java.lang.Math.sqrt;

public class Triangle extends Figure {
    public double a,b,c;
    private double p;
    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double perimetr(){
        return (a+b+c);
    }
    public double area(){
        p=(a+b+c)/2;
        return sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
