package com.example.springdilab.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

 // Field final → immutable, dijamin terisi
         private final NotificationService notificationService;

 // Constructor Injection — Spring otomatis inject NotificationService
         // Karena hanya 1 constructor, @Autowired tidak perlu ditulis
         public OrderService(NotificationService notificationService) {
            this.notificationService = notificationService;

             // Tambahkan ini:
             System.out.println("NotificationService hashCode di OrderService: "
                     + notificationService.hashCode());

    // ... method lain tetap

 System.out.println("OrderService dibuat! Notification type: "
                + notificationService.getType());
   }

 public String placeOrder(String customerEmail, String item) {
 System.out.println("Memproses pesanan: " + item);
 String result = notificationService.send(customerEmail,
                "Pesanan " + item + " berhasil diterima!");
 return "Order placed: " + item + " | " + result;
    }
}