package com.fusion.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/extraction")
public class ExtractionController {

    @GetMapping("/ping")
    public String ping() {
        return "Extraction Service is running!";
    }
}
