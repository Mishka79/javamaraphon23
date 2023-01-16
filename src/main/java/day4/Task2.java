package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array =new int[99];
        Random rand =new Random();
        for (int i=0;i< array.length;i++) {
            array[i] = rand.nextInt(10000);
            System.out.print(array[i] +" ");
        }
        System.out.println();
        int max, min, count, sum;
        max=array[0];
        min=array[0];
        count=0;
        sum=0;
        for (int i:array)
        {
            if (max<i) max=i;
            if (min>i) min=i;
            if (i%10==0)
            {
              count++;
              sum=sum+i;
            }
        }
        System.out.println("Наибольший элемент массива :"+ max);
        System.out.println("Наименьший элемент массива "+ min);
        System.out.println("Количество элементов массива оканчивающихся на 0 : "+count);
        System.out.println("Сумма всех элементов массива оканчивающихся на 0: "+sum);
    }
}
