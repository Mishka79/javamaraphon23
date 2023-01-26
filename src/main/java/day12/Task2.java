package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        zap(0, 30, list);
        zap(300, 350, list);
        System.out.println(list.toString());

    }

    private static void zap(int s, int f, List<Integer> list) {
        for (int i = s; i <= f; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
    }

}
