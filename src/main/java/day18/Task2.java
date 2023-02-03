package day18;

import static java.lang.Math.floor;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(758777497));
    }

    public static int count7(long x) {
        if (x > 0) {
            if (x % 10 == 7) {
                return count7((long) floor(x / 10)) + 1;
            } else return count7((long) floor(x / 10));
        } else   return 0;

    }
}
