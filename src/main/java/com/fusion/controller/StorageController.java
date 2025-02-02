package com.fusion.controller;

import com.fusion.service.gcp.GcsStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.io.IOException;

@RestController
@RequestMapping("/api/storage")
public class StorageController {

    @Autowired
    private GcsStorageService gcsStorageService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("filePath") String filePath,
                                             @RequestParam("fileName") String fileName) throws IOException {
        return ResponseEntity.ok(gcsStorageService.uploadFile(filePath, fileName));
    }

    @GetMapping("/download")
    public ResponseEntity<byte[]> downloadFile(@RequestParam("fileName") String fileName) {
        return ResponseEntity.ok(gcsStorageService.downloadFile(fileName));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteFile(@RequestParam("fileName") String fileName) {
        return ResponseEntity.ok(gcsStorageService.deleteFile(fileName));
    }
}