package com.fusion.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    @GetMapping("/ping")
    public String ping() {
        return "Document Service is running!";
    }
}
