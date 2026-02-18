package com.example.springdilab;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDiLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDiLabApplication.class, args);
    }

    @Bean
    public CommandLineRunner showBeans(ApplicationContext ctx) {
        return args -> {
            System.out.println("\n====== BEAN YANG KITA BUAT ======");
            String[] beanNames = ctx.getBeanDefinitionNames();
            for (String name : beanNames) {
                // Filter hanya Bean dari package kita
                Object bean = ctx.getBean(name);
                if (bean.getClass().getPackageName().startsWith("com.example")) {
                    System.out.println("  - " + name + " → " + bean.getClass().getSimpleName());
                }
            }
            System.out.println("=================================\n");
        };
    }
}