package day9.Task2;

public  class Rectangle extends Figure{
    public double dlina,shirina;

    public Rectangle(double dlina, double shirina,String color) {
        super(color);
        this.dlina = dlina;
        this.shirina = shirina;
    }
    public double area(){
        return dlina*shirina;
    }
    public double perimetr(){
        return (dlina+shirina)*2;
    }
}
