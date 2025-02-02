package com.fusion.service.vault;

import org.springframework.stereotype.Service;

@Service
public class VaultGcpAuthService {

    public String authenticate() {
        return "Authenticating with Vault for GCP access...";
    }
}
