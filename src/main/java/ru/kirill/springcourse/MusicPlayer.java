package ru.kirill.springcourse;

public class MusicPlayer {
    private Music music;

    // Inversion Control (IoC)
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
