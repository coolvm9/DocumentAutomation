package com.fusion.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dlp")
public class DLPController {

    @GetMapping("/ping")
    public String ping() {
        return "DLP Service is running!";
    }
}
