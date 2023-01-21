package day9.Task2;

public abstract class  Figure {
    public String  color;
    public Figure(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public abstract double area();
    public abstract double perimetr();
}
