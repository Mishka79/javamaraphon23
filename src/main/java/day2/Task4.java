package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число x ");
        double x = s.nextDouble();

        if (x>=5)
        {
            double y= (x*x-10)/(x+7);
            System.out.println("y= "+y);
        }
        if ((x> -3)&& (x<5))
        {
            double y= (x*x-2)*(x+3);
            System.out.println("y= "+y);
        }
        if (x<= -3)
        {

            System.out.println("y= 420");
        }
    }

}
