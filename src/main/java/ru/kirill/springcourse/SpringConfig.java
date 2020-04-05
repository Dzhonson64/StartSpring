package ru.kirill.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/* Конфигурационный файл*/
@Configuration
@ComponentScan("ru.kirill.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
