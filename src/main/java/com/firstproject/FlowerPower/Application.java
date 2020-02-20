package com.firstproject.FlowerPower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //аннотация проверки, нахождения контроллеров, подключения к бд
public class Application { //файл запуска

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
