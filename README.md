# 📁 Project Title: Albums-API-Backend

## 💡 Overview

**Albums-API-Backend** is a RESTful API built using Spring Boot that powers the Albums frontend application. It provides secure authentication, album and photo management, and all necessary CRUD operations. The backend handles data persistence, user management, and enables seamless communication with the frontend through well-structured REST endpoints.

---

## ✨ Features

- **User Authentication**: Secure registration and login with JWT-based authentication.
- **Album Management**: Create, view, update, and delete albums tied to a user.
- **Photo CRUD Operations**: Upload, view, update, delete, and download photos within albums.
- **Download Support**: Users can download uploaded photos.
- **Cross-Origin Resource Sharing (CORS)**: Configured to allow frontend access via environment variable.
- **RESTful API Design**: Clean and modular API structure.
- **Swagger Documentation**: Interactive API testing and exploration.
  
---

## 🛠️ Tech Stack Used

- **Framework**: Spring Boot  
- **Security**: Spring Security + JWT  
- **Database**: H2 
- **JPA**: Spring Data JPA
- **Docker**:  Used for containerizing the application
- **Other Tools & Libraries**:
  - Lombok
  - ModelMapper
  - Apache Commons IO
  - Multipart Support for file handling
  - Springdoc OpenAPI (Swagger UI)
  - Maven

---

## 🚀 How to Run the Backend Application

### Prerequisites

- Java 17 or later (Java 23 specified in pom.xml)
- Maven (v3.8+)

### **Open your terminal or command prompt.**

### Clone the Repository

```bash
git clone https://github.com/iamhruthiks/Albums-API-Backend.git
```

### Navigate inside Project Directory

```bash
cd Albums-API-Backend
```

### Configure Secret Properties
Create a secret.properties file in src/main/resources and add:

```bash
CORS_ALLOWED_ORIGIN=http://localhost:3000
```

### Start the Application

```bash
./mvnw spring-boot:run
```

Or, if Maven is globally installed:

```bash
mvn spring-boot:run
```

### Access the Application

- App Base UR: `http://localhost:8080/api/`
- H2 Console (Database): `http://localhost:8080/db-console`
  - Username: `admin`, Password: `password`
- Swagger UI: `http://localhost:8080/swagger-ui/index.html`

_💡 Note: To interact with the app, make sure your [Frontend](https://github.com/iamhruthiks/Albums-Frontend) is running._

---

## 📁 Project Structure

- `com.example.SpringRestDemo`
  - `controller`: Web endpoints
  - `service`: Business logic
  - `model`: JPA entities
  - `repository`: Spring Data interfaces
  - `config`: Seed data and Email config
  - `security`: Security setup and Application config

---

## 📦 Dependencies Used

- `spring-boot-starter-web`
- `spring-boot-starter-security`
- `spring-boot-starter-data-jpa`
- `spring-boot-starter-validation`
- `spring-boot-starter-mail`
- `springdoc-openapi-ui`
- `thymeleaf-extras-java8time`
- `jjwt`
- `h2database`
- `modelmapper`
- `commons-io`
- `lombok`

---

## 🌐 Deployment

- 🌱 The backend application is deployed on **Render**.  
- 👤 **Guest Login for Demo**:  
  You can use the following credentials to explore the app without registering:  
  - **Email**: `user@user.com`  
  - **Password**: `password`  
  _(Note: This is a demo account for exploration purposes only.)_

---

## 📜 Acknowledgements

_This project was developed as one of my the **capstone projects** for the course **"FULL STACK JAVA DEV: JAVA + JSP + SPRING + BOOT + JS + REACT"**._

_I extend my heartfelt thanks to **Chand Sheikh** and the **StudyEasy Organization** for creating such a comprehensive and engaging learning experience. The course's practical, project-driven approach and clear explanations were instrumental in equipping me with the skills and confidence to bring this application to life. It has been a pivotal step in my journey to becoming a full-stack Java developer._

---

## 📷 Screenshots - Swagger-UI
<img width="959" alt="bb" src="https://github.com/user-attachments/assets/0f31ec9f-ca98-430b-8ef5-7afdeef3b37c"><hr>
<img width="959" alt="bb2" src="https://github.com/user-attachments/assets/d423be35-7a54-4736-9faf-49778cf0b86d"><hr>
<img width="959" alt="bb3" src="https://github.com/user-attachments/assets/0afc49ef-1ac1-41d4-8fe3-487ee14c0d90"><hr>
