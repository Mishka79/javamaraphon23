package day12.task5;

import java.util.List;

public class MusicArtist {
    private String member;
    private int age;

    public MusicArtist(String member, int age) {
        this.member = member;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "member='" + member + '\'' +
                ", age=" + age +
                '}';
    }
}
