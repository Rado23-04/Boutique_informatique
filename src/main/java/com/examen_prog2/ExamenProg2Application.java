package com.examen_prog2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.examen_prog2","Controller"})
public class ExamenProg2Application {
    public static void main(String[] args) {
        SpringApplication.run(ExamenProg2Application.class, args);
    }

}
