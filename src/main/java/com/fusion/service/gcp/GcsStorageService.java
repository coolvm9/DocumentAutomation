package com.fusion.service.gcp;

import com.google.cloud.storage.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

@Service
public class GcsStorageService {

    @Value("${gcp.project-id}")
    private String projectId;

    @Value("${gcp.storage.bucket-name}")
    private String bucketName;

    private final Storage storage;

    public GcsStorageService(Storage storage) {
        this.storage = storage;
    }

    public String uploadFile(String filePath, String fileName) throws IOException {
        BlobId blobId = BlobId.of(bucketName, fileName);
        BlobInfo blobInfo = BlobInfo.newBuilder(blobId).build();
        storage.create(blobInfo, Files.readAllBytes(Paths.get(filePath)));
        return " File uploaded to GCS: " + fileName;
    }

    public byte[] downloadFile(String fileName) {
        Blob blob = storage.get(BlobId.of(bucketName, fileName));
        return blob.getContent();
    }

    public String deleteFile(String fileName) {
        boolean deleted = storage.delete(BlobId.of(bucketName, fileName));
        return deleted ? " File deleted: " + fileName : " File not found!";
    }
}