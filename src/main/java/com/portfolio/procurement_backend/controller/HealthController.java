package com.portfolio.procurement_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class HealthController {


    @GetMapping("/hello")
    public Map<String, Object> hello(){
        return Map.of("message", "Procurement API is running",
                "status", "SUCCESS", "timestamp", Instant.now().toString());
    }

}
