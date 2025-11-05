package com.deliverytech.delivery_api.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthController {

    @GetMapping
    public Map<String, String> home() {
        return Map.of(
            "message", "Delivery Tech API is running!",
            "endpoints", "/health, /info"
        );
    }


    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
            "status", "up",
            "timestamp", LocalDateTime.now().toString(),
            "service", "Delivery API",
            "javaVersion", System.getProperty("java.version")
        );
    }

    @GetMapping("/info")
    public AppInfo info() {
        return new AppInfo(
            "Delivery Tech API",
            "1.0.0",
            "davidviana",
            "JDK 21",
            "Spring Boot 3.2.X"
        );
    }
    
    public record AppInfo(
        String application, 
        String version, 
        String developer, 
        String javaVersion, 
        String framework
    ) {}
}