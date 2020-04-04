package ru.kirill.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        /* Читаем application context, который в виде xml */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
        );
        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusi2c = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        System.out.println(classicalMusi2c.getSong());



        /* обязательно закрываем AppContext */
        context.close();
    }
}
