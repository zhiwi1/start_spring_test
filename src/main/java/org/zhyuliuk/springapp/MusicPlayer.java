package org.zhyuliuk.springapp;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> music = new ArrayList<>();
    private String name;
    private int volume;

    //IoC
    public MusicPlayer() {

    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public void playMusic() {
        for (Music music : music)
            System.out.println("song: " + music.getSong());
    }
}
