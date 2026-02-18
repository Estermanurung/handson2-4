package com.example.springdilab.service;

import org.springframework.stereotype.Service;

@Service // ← Spring: "Buat Bean dari class ini dan simpan di gudang"
public class EmailNotificationService implements NotificationService {

 @Override
 public String send(String to, String message) {
 // Simulasi kirim email
 System.out.println("[EMAIL] Mengirim ke " + to + ": " + message);
 return "Email terkirim ke " + to;
   }

 @Override
 public String getType() {
 return "EMAIL";
   }
}