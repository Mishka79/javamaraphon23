package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
    MusicBand band1 = new MusicBand("BI-2",2000);
    MusicBand band2 = new MusicBand("Metallica",2007);
    MusicBand band3 = new MusicBand("Scorpions",1979);
    MusicBand band4 = new MusicBand("Queen",1975);
    MusicBand band5 = new MusicBand("A-ha",2002);
    MusicBand band6 = new MusicBand("Bravo",1992);
    MusicBand band7 = new MusicBand("DDT",1981);
    MusicBand band8 = new MusicBand("Modern toking",1976);
    MusicBand band9 = new MusicBand("Kino",1989);
    MusicBand band10 = new MusicBand("Mummi trol",2011);
    List<MusicBand> list = new ArrayList<>();
    List<MusicBand> list3 = new ArrayList<>();
    list.add(band1);
    list.add(band2);
    list.add(band3);
    list.add(band4);
    list.add(band5);
    list.add(band6);
    list.add(band7);
    list.add(band8);
    list.add(band9);
    list.add(band10);
    Collections.shuffle(list);
    list3=groupsAfter2000(list);
    for (int i=0;i<list.size();i++){
        System.out.println(list.get(i).toString());}
        System.out.println();
    for (int i=0;i<list3.size();i++){
        System.out.println(list3.get(i).toString());}


    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bands1=new ArrayList<>();

        for (int i=0; i< bands.size();i++){
            if (bands.get(i).getYear()>2000){ bands1.add(bands.get(i));}
            }
        return bands1;
        }

    }
