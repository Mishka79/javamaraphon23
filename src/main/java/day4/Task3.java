package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
    int [] [] array= new int [12] [8];
        Random rand = new Random();
        for (int i=0;i<12;i++)
            for (int j=0;j<8;j++)
                array[i][j]= rand.nextInt(50);
        int count, max, sum;
        count=0;
        max=0;
        for (int i=0;i<12;i++) {
            sum=0;
            for (int j = 0; j < 8; j++) {
                System.out.print(array[i][j]+" ");
                sum=sum + array[i][j];
            if (max<sum)
            {
                max=sum;
                count=i;
            }
             }System.out.println("сумма "+sum);
        }
        System.out.println(count);
    }
}
