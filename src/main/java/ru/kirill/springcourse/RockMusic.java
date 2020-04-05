package ru.kirill.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{
    List<String> musics;


    public RockMusic(List<String> musics) {
        this.musics = musics;
    }

    public String getSong() {
        Random rnd = new Random();
        return musics.get(rnd.nextInt(musics.size()));
    }
}
