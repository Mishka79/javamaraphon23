package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите числа А и Б через пробел ");
        int a = s.nextInt();
        int b = s.nextInt();
        if (a>=b)
        {
            System.out.println("Некоректный ввод");
        }
        while (a<b-1)
        {
           a++;
            if ((a % 5 == 0) && (a % 10 != 0))
            {
                System.out.print(a + " ");
            }

        }

    }
}
