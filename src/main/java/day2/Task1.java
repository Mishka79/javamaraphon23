package day2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        //System.out.print("Введите количество этажей в доме ");
        int stage = s.nextInt();
        if (stage>0 && stage<5) {
            System.out.println("Малоэтажный дом");
        }
        if (stage>4 && stage<9) {
            System.out.println("Среднеэтажный дом");
        }
        if (stage>8) {
            System.out.println("Многоэтажный дом");
        }
        if (stage<1) {
            System.out.println("Ошибка ввода");
        }
    }
}
