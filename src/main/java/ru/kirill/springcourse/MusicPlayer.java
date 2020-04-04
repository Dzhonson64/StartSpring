package ru.kirill.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Inversion Control (IoC)
    public MusicPlayer(Music music) {
        this.music = music;
    }

    /* В старых версия Spring его у нас только сеттер принимает значения, то дефолтный конструктор явно определяем */
    public MusicPlayer() {
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println(music.getSong());
    }
}
