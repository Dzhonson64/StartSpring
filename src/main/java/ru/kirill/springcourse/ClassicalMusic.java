package ru.kirill.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getFactoryClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destraction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rapsodia";
    }
}
