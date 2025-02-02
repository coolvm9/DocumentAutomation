# DocProcessing - Spring Boot Vault GCP Application

## Overview
This Spring Boot application provides services for document processing using **Google Cloud Document AI, Vertex AI, and Vault for secrets management**.

## Features
- **Document Upload & Processing** using GCP Document AI
- **AI-based Processing** via Vertex AI
- **Vault-based Secrets Management**
- **Secure API Authentication & Authorization**

## Project Structure
- **Controller Layer:** API endpoints (`/api/documents`, `/api/ai`, etc.)
- **Service Layer:** Business logic and integration with external APIs.
- **Security:** Vault-based authentication.
- **Storage Layer:** GCP Cloud Storage, PostgreSQL, or another database.

## How to Run
1. **Set up Vault & GCP credentials** in `application.yml`.
2. **Build the project**:
   ```sh
   ./gradlew build
   ```
3. **Run the application**:
   ```sh
   ./gradlew bootRun
   ```

## API Documentation
Once running, visit:
[Swagger UI](http://localhost:8080/swagger-ui.html)
