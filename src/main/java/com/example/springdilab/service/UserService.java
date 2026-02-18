package com.example.springdilab.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
        System.out.println("NotificationService hashCode di UserService: "
                + notificationService.hashCode());
    }

    public String registerUser(String email) {
        return notificationService.send(email, "Registrasi berhasil!");
    }
}