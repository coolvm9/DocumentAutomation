package com.fusion.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/storage")
public class StorageController {

    @GetMapping("/ping")
    public String ping() {
        return "Storage Service is running!";
    }
}
