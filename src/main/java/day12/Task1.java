package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Renault");
        list.add("Audi");
        list.add("Lamborgini");
        list.add("Honda");
        list.add(2,"Toyota");
        list.remove(0);
        System.out.println(list.toString());
    }
}
