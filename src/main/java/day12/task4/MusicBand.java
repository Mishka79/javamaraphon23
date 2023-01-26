package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public int getYear() {
        return year;
    }
    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }
    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band2.members.addAll(band1.members);
        band1.members.clear();
    }
    public void printMembers() {
        System.out.println(this.members);
    }
    public List<String> getMembers() {
        return members;
    }
}

