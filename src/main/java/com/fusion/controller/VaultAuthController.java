package com.fusion.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vault")
public class VaultAuthController {

    @GetMapping("/ping")
    public String ping() {
        return "Vault Authentication Service is running!";
    }
}
