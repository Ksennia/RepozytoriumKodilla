package com.kodilla.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

import static org.springframework.boot.SpringApplication.run;

@SpringBootConfiguration
public class SpringRunner {
    public static void main (String[] args) {
        SpringApplication.run(SpringRunner.class, args);

    }
}
