package ru.yandex.incoming34.SpringHomeWork6;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHomeWork6 {
    public static void main(String[] args) {
    	TimeZone.setDefault(TimeZone.getTimeZone("UTC"));    	
        SpringApplication.run(SpringHomeWork6.class, args);
    }
}