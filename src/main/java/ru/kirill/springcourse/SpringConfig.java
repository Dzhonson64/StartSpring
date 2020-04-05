package ru.kirill.springcourse;

import org.springframework.context.annotation.*;

import java.util.ArrayList;

/* Конфигурационный файл*/
@Configuration
@ComponentScan("ru.kirill.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic(new ArrayList<String>());
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic(new ArrayList<String>());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusic(), classicalMusic());
    }
}
