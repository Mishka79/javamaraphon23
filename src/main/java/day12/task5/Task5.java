package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        MusicArtist artist = new MusicArtist("Petr Petrov",35);
        members1.add(artist);
        MusicArtist artist1= new MusicArtist("Ivan Ivanov",37);
        members1.add(artist1);
        MusicArtist artist2 =new MusicArtist("Sidr Sidirov",40);
        members1.add(artist2);
        day12.task5.MusicBand band1 = new day12.task5.MusicBand("DDT",2002,members1);
        List <MusicArtist> members2 = new ArrayList<>();
        MusicArtist artist3 = new MusicArtist("Ivan Vasilevich",21);
        members2.add(artist3);
        MusicArtist artist4= new MusicArtist("Mikhail Ivanovich",43);
        members2.add(artist4);
        MusicArtist artist5 =new MusicArtist("Ivan Mikhailovic",60);
        members2.add(artist5);
        day12.task5.MusicBand band2 =new day12.task5.MusicBand("Time  mashine",1980,members2);

        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1,band2);
        band1.printMembers();
        band2.printMembers();
    }
}
