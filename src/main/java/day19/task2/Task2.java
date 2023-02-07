package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Misha\\Desktop\\JavaMarathon2021\\src\\main\\resources\\taxi_cars.txt");
        Map<Integer, Point> map = new HashMap<>();
        int id;
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter(" ");
            while (scanner.hasNextLine()) {
                id = (int) Double.parseDouble(scanner.next());
                Point point = new Point((int) Double.parseDouble(scanner.next()), (int) Double.parseDouble(scanner.nextLine()));
                map.put(id, point);
                //System.out.println(id+" "+point.getX()+" "+point.getY());
            }
            scanner.close();
            Scanner scanner1 = new Scanner(System.in);

            int x1, x2, y1, y2;
            System.out.println("Введите четыре числа через пробел х1 y1 x2 y2 ");
            x1 = scanner1.nextInt();
            y1 = scanner1.nextInt();
            x2 = scanner1.nextInt();
            y2 = scanner1.nextInt();
            for (Map.Entry entry : map.entrySet()) {
                int z = (Integer) entry.getKey();
                if ((x1 < (map.get(z).getX()) & (map.get(z).getX()) < x2) & (y2 < map.get(z).getY() & map.get(z).getY() < y1)) {
                    System.out.println(entry.getKey());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

