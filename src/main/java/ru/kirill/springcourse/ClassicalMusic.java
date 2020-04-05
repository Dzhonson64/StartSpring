package ru.kirill.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    List<String> musics;

    public ClassicalMusic(List<String> musics) {
        this.musics = musics;
    }

    @Override
    public String getSong() {
        Random rnd = new Random();
        return musics.get(rnd.nextInt(musics.size()));
    }
}
