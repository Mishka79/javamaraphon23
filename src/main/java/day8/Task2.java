package day8;

public class Task2 {
    public static void main(String[] args) {
    Airplane airplane = new Airplane("Boeing",2000,150,10000);
    long startTime = System.currentTimeMillis();
    System.out.println(airplane);
    long stopTime = System.currentTimeMillis();
    System.out.println(stopTime-startTime);
    }
}
