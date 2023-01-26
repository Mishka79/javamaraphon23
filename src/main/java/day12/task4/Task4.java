package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List <String> members1 = new ArrayList<>();
        members1.add("Petr Petrov");
        members1.add("Ivan Ivanov");
        members1.add("Sidr Sidirov");
        MusicBand band1 = new MusicBand("BI-2",2000,members1);
        List <String> members2 = new ArrayList<>();
        members2.add("Ivan Vasilevich");
        members2.add("Mikhail Ivanovich");
        members2.add("Ivan Mikhailovich");
        MusicBand band2 = new MusicBand("Metallica",2007,members2);
        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1,band2);
        band1.printMembers();
        band2.printMembers();
    }
}
