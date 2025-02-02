package com.fusion.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DocumentRepository {

    public String saveDocument() {
        return "Saving document to database...";
    }
}
