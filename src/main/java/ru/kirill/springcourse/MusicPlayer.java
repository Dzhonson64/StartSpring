package ru.kirill.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    @Autowired

    public MusicPlayer(@Qualifier("rockMusic")Music music1, @Qualifier("classicalMusic")Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    private Music music1;
    private Music music2;

    public void playMusic() {
        System.out.println(music1.getSong());
        System.out.println(music2.getSong());
    }
}
