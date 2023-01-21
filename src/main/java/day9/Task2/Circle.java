package day9.Task2;

import static java.lang.Math.*;

public class Circle extends Figure{
    public double radius;

    public Circle(double radius,String color) {
        super(color);
        this.radius = radius;
    }
    public double perimetr(){
        return 2*PI*radius;
    }
    public double area(){
        return PI*pow(radius,2);
    }
}

