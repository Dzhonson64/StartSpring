package ru.kirill.springcourse;

import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

/* Конфигурационный файл*/
@Configuration
@ComponentScan("ru.kirill.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic(classicalMusics());
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic(rockMusics());
    }
    @Bean
    public List<Music> musicList(){
        List<Music> musicList = new ArrayList<>();
        musicList.add(classicalMusic());
        musicList.add(rockMusic());
        return musicList;
    }

    @Bean
    public List<String> rockMusics(){
        List<String> musicList = new ArrayList<>();
        musicList.add("rocks1");
        musicList.add("rocks2");
        musicList.add("rocks13");
        return musicList;
    }

    @Bean
    public List<String> classicalMusics(){
        List<String> musicList = new ArrayList<>();
        musicList.add("classic1");
        musicList.add("classic2");
        musicList.add("classic3");
        return musicList;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
}
