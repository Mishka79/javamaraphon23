package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = (scanner.nextLine());
                String[] line2 = line.split(" ");
                Person person = new Person();
                try {
                    if (Integer.parseInt(line2[1]) > 0) {
                        person.name = line2[0];
                        person.age = Integer.parseInt(line2[1]);
                        list.add(person);
                    } else try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
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
