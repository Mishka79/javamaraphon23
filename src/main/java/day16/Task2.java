package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.floor;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        final int  MAXCOUNT=1000;
        final int MAXVALUE=100;
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        PrintWriter pw2 =new PrintWriter(file2);
        PrintWriter pw= new PrintWriter(file1);
        Random random = new Random();
        double sum=0;

        for (int i =1;i<=MAXCOUNT;i++){
            int x=random.nextInt(MAXVALUE);
            pw.print(x+" ");
            sum+=x;
            if (i%20==0){
                pw2.print(sum/20+";");
                sum=0;
            }
        }
        pw.close();
        pw2.close();
        printResult(file2);


    }
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner=new Scanner(file);
        Double sum=0.0;
        String[] array = scanner.nextLine().split(";");
        for (int i=0;i<array.length;i++){
            sum+=Double.parseDouble(array[i]);
        }
        System.out.println(floor(sum));
    }
}
