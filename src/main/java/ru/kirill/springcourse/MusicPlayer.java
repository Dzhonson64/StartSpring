package ru.kirill.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    List<Music> musicList;
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    private Music music1;
    private Music music2;
    @Value("${musicPlayer.name}")
    private String name;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Value("${musicPlayer.volume}")
    private int volume;

    public void playMusic() {
        for (Music item:musicList){
            System.out.println(item.getSong());
        }
    }
}
