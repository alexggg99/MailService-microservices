package com.alexggg99.spring.cloud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class OcrRacesApplication implements CommandLineRunner {

    private static List<Race> races = new ArrayList<>();
    private Date date;

    public static void main(String[] args) {
        SpringApplication.run(OcrRacesApplication.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception {
        races.add(new Race("Spartan Beast", "123", "MA", "Boston__1"));
        races.add(new Race("Tough Mudder RI", "456", "RI", "Providence___1"));
    }

    @RequestMapping("/")
    public List<Race> getRaces() {
        return races;

    }
}

