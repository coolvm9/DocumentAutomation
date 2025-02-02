package com.fusion.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/search")
public class SearchController {

    @GetMapping("/ping")
    public String ping() {
        return "Search Service is running!";
    }
}
