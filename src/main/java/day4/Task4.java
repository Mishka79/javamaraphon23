package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int [] array= new int [99];
        Random rand = new Random();
        for (int i=0;i<99;i++)
            array[i]= rand.nextInt(10000);
        int count, max, sum;
        count=0;
        max=0;
        sum=0;
        for (int i=0;i<97;i++) {
            sum=0;
            //System.out.print(array[i]+" ");
            sum=array[i]+array[i+1]+array[i+2];
                if (max<sum)
                {
                    max=sum;
                    count=i;

            }
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(count);
    }
}
