package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");
        printResult(file);
    }

    public static void printResult(File file) {

        try {
            Scanner scanner = new Scanner(file);
            String[] numbers = scanner.nextLine().split(" ");
            double sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += Integer.parseInt(numbers[i]);
            }
            sum = sum / (numbers.length);
            System.out.print(sum);
            System.out.format(" --> %.3f", sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

