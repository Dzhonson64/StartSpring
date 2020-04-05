package ru.kirill.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Autowired

    public MusicPlayer(@Qualifier("rockMusic")Music music1, @Qualifier("classicalMusic")Music music2) {
        this.music1 = music1;
        this.music2 = music2;
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

    public void playMusic(TypeMucis type) {
        if (type == TypeMucis.CLASSICAL){
            System.out.println(music2.getSong());
        }else{
            System.out.println(music1.getSong());
        }
    }
}
