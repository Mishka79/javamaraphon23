package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();

        members1.add(new MusicArtist("Petr Petrov",35));

        members1.add(new MusicArtist("Ivan Ivanov",37));

        members1.add(new MusicArtist("Sidr Sidirov",40));
        day12.task5.MusicBand band1 = new day12.task5.MusicBand("DDT",2002,members1);
        List <MusicArtist> members2 = new ArrayList<>();

        members2.add(new MusicArtist("Ivan Vasilevich",21));

        members2.add(new MusicArtist("Mikhail Ivanovich",43));

        members2.add(new MusicArtist("Ivan Mikhailovic",60));
        day12.task5.MusicBand band2 =new day12.task5.MusicBand("Time  mashine",1980,members2);

        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1,band2);
        band1.printMembers();
        band2.printMembers();
    }
}
