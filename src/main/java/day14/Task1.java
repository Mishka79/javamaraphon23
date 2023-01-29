package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static final int N = 10;

    public static void main(String[] args) {

        File file = new File("test");
        printSumDigits(file);

    }

    public static void printSumDigits(File file) {

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            int counter = 0;
            int sum = 0;
            for (String number : numbersString) {
                sum += Integer.parseInt(number);
                counter++;
            }
            if (counter != 10) try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Некорректный входной файл");
            }
            else {
                System.out.println(sum);
                scanner.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}
