package com.fusion.service.vault;

import org.springframework.stereotype.Service;

@Service
public class VaultAzureAuthService {

    public String authenticate() {
        return "Authenticating with Vault for Azure access...";
    }
}
