# Spring Boot REST API Template 🚀

This is a **Spring Boot REST API starter template** built with **Java 21** and **MySQL**.  
It includes essential dependencies and pre-configured setup for rapid backend development.

---

## ✨ Features
-  **Spring Boot 3.x**
-  **Java 21 (Temurin JDK)**
-  **REST API template**
-  **JWT Authentication** (ready-to-use filter & config)
-  **Spring Security** with customizable rules
-  **Swagger UI** for API documentation
-  **DevTools** (auto-reload on changes)
-  **CORS enabled** (development friendly)
-  **MySQL database integration**

---

## ⚙️ Prerequisites
- **Java 21** (Temurin JDK recommended)  
- **Maven 3.8+**  
- **MySQL 8.x** (or change DB in `application.properties`)  

---

## 🛠️ Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/spring-boot-template.git
cd spring-boot-template
```
### 2. Configure Environment

Edit the .env file in the root :
```bash
DB_URL=jdbc:mysql://localhost:3306/demo
DB_USERNAME=root
DB_PASSWORD=yourpassword
```

Update src/main/resources/application.properties to read env vars:
```bash
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

### 3. Run the Application
``` bash
mvn spring-boot:run
```

App starts on:
👉 http://localhost:8080

Swagger docs:
👉 http://localhost:8080/swagger-ui/index.html

#### Security Config -> JWT Protected
```bash
/user/**
```
You can adjust this in SecurityConfig.java
