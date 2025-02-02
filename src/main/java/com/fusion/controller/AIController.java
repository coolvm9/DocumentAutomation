package com.fusion.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
public class AIController {

    @GetMapping("/ping")
    public String ping() {
        return "AI Service is running!";
    }
}
