package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {

        List<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = (scanner.nextLine());
                String[] line2 = line.split(" ");
                try {
                    if (Integer.parseInt(line2[1]) > 0) {
                        list.add(line);
                    } else try {
                        throw new IOException("Некорректный входной файл");
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                        list = null;
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Неправильный формат строки!");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return list;
    }
}