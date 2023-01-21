package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String string1 = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20001; i++) {
            string1 = string1 + i + " ";
        }
        System.out.println(string1);
        stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);
    }
}
