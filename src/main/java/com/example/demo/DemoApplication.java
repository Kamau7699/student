package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    Student student=new Student(Name:"Alam Thuku", Number:"007699");

    Units units=new Units(name:"Application Programing");
}
