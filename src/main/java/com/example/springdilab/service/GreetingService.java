package com.example.springdilab.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingService() {
        System.out.println("GreetingService dibuat oleh Spring!");
    }

    public String greet(String name) {
        return "Halo, " + name + "! Selamat datang di Spring Boot.";
    }
}