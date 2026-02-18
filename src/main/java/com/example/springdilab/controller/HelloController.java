package com.example.springdilab.controller;

import com.example.springdilab.service.GreetingService;
import com.example.springdilab.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController  // = @Controller + @ResponseBody (return string/JSON langsung)
public class HelloController {

    private final GreetingService greetingService;
    private final OrderService orderService;

    // Constructor Injection — 2 dependency sekaligus
    public HelloController(GreetingService greetingService,
                           OrderService orderService) {
        this.greetingService = greetingService;
        this.orderService = orderService;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "Mahasiswa") String name) {
        return greetingService.greet(name);
    }

    @GetMapping("/order")
    public String order(@RequestParam(defaultValue = "john@example.com") String email,
                        @RequestParam(defaultValue = "Nasi Goreng") String item) {
        return orderService.placeOrder(email, item);
    }
}