package com.example.springdilab.service;

public interface NotificationService {
    String send(String to, String message);
    String getType();
}
