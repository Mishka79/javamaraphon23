package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[99];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(10000);

        int count, max, sum, j;
        count = 0;
        max = 0;
        sum = 0;

        for (int i = 0; i < (array.length - 2); i++) {
            sum = 0;
            for (j = 0; j < 3; j++)
                sum = sum + array[i + j];

            if (max < sum) {
                max = sum;
                count = i;


            }
        }

        System.out.println(max);
        System.out.println(count);
    }
}
