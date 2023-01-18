package day6;

public class Task2 {
    public static void main(String[] args) {
    Airplane plane1 = new Airplane("Boing",2010,32,10000);
    plane1.setYear(2011);
    plane1.setLength(35);
    plane1.fillUp(1000);
    plane1.fillUp(1500);
    plane1.info();
    }
}
