package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double a,b;
        Scanner scaner = new Scanner(System.in);
        for (int i=0; i<5;i++) {
            System.out.print("Введите два числа через пробел ");
            a=scaner.nextDouble();
            b=scaner.nextDouble();
            if (b==0)
            {
                System.out.println("Дление на 0");
                continue;
            }
            System.out.println(a/b);

        }
    }
}
