package com.myfirst_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringBootApplication {

    public static void main(String[] args) {
        System.out.println("Hello Paresh");
        SpringApplication.run(MyFirstSpringBootApplication.class, args);
    }

}
