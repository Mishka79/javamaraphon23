package day15;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Misha\\Desktop\\JavaMarathon2021\\src\\main\\java\\day15\\shoes.csv");
        File file1 = new File("C:\\Users\\Misha\\Desktop\\JavaMarathon2021\\src\\main\\resources\\missing_shoes.txt");
        Scanner scanner=new Scanner(file);
        PrintWriter pw=new PrintWriter(file1);

            while (scanner.hasNextLine()){
                String[] array = scanner.nextLine().split(";");
                if (Integer.parseInt(array[2])==0) {
                    pw.println(array[0]+", "+array[1]+", "+array[2]);
                }
            }
        pw.close();
        scanner.close();
    }
}
