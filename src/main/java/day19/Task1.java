package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        File file=new File("C:\\Users\\Misha\\Desktop\\JavaMarathon2021\\src\\main\\resources\\dushi.txt");
        Scanner scanner = null; // в text находится файл dushi.txt
        String string;
        try {
            scanner = new Scanner(file);
            scanner.useDelimiter("[.,:;()?!\"\\s–]+");
            while (scanner.hasNext()){
                string= scanner.next();
               // System.out.println(string);
            if (map.get(string)==null){
                map.put(string, 1);
            }
               else map.put(string, map.get(string)+1);
            }
            //Чичиков -601

            for (Map.Entry entry: map.entrySet()) {

                if (Double.parseDouble(entry.getValue().toString())>120) {
                    System.out.println(entry);
                }
            }

        if (map.get("Чичиков")!=null){
            System.out.println("Чичиков - " +map.get("Чичиков"));
        }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
