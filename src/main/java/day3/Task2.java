package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double b=0;
        double a=0;
        double c=0;
        Scanner scanner = new Scanner(System.in);
        do {
           // System.out.print(" Введите два числа - делимое и делитель через пробел ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            if (b==0) break;
            c=a/b;
            System.out.println(c);
        } while (true);
    }
}
