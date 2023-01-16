package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива ");
        Scanner scan = new Scanner(System.in);
        System.out.println();
        int count = scan.nextInt();
        int [] array = new int[count];
        Random rand = new Random();
        for (int i=0;i<count;i++)
            array[i]= rand.nextInt(11);
        for (int i:array)
          System.out.print(i+" ");
        System.out.println();
        // System.out.println(Arrays.toString(array));

        int max, one, chet, nechet, sum;
        max=0; one=0; chet=0; nechet=0;sum=0;
        for (int i=0;i<count;i++)
        {
            if (array[i]>8) max++;
            if (array[i]==1) one++;
            if (array[i]%2==0) chet++;
            if (array[i]%2!=0) nechet++;
            sum= sum+array[i];
        }
        System.out.println("Длина массива "+ count);
        System.out.println("количество чисел больших 8 : "+ max);
        System.out.println("Количество чисел равных 1 :"+ one);
        System.out.println("Количество четных чисел : "+ chet);
        System.out.println("Количество нечетных чисел : "+nechet);
        System.out.println("Сумма всех элементов массимва : "+sum);
    }
}

