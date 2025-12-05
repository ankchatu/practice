package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String home() {
        return "🚀 Spring Boot App Running Successfully!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Docker + Spring Boot!";
    }

    @GetMapping("/status")
    public String status() {
        return "Application Status: OK";
    }
}

