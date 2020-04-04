package ru.kirill.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        /* Читаем application context, который в виде xml */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationcontext.xml"
        );

        /* Получаем бин (объект), где указываем перым параметром  id из AppContext, вторым класс, который будет возвращён*/
        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());

        /* обязательно закрываем AppContext */
        context.close();
    }
}
