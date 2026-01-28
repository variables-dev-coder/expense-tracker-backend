# 🚀 Expense Tracker Backend API

A production‑ready **Spring Boot REST API** for managing personal expenses with **JWT authentication, PostgreSQL, validation, and Swagger docs**.

Built step‑by‑step as a real‑world backend project.

---

# ✨ Features

## 🔐 Authentication & Security

* User Registration
* Login with JWT token
* BCrypt password hashing
* JWT validation filter
* Protected APIs
* User‑specific data isolation

## 💼 Expense Management (CRUD)

* Add expense
* Get my expenses only
* Update expense
* Delete expense

## 🧠 Professional Practices

* Bean validation (@Valid)
* Global exception handling
* Clean error responses
* Swagger documentation
* Environment variable config
* Cloud ready (Render)

---

# 🛠️ Tech Stack

| Layer      | Tech                        |
| ---------- | --------------------------- |
| Backend    | Spring Boot 3               |
| Security   | Spring Security + JWT       |
| Database   | PostgreSQL                  |
| ORM        | JPA / Hibernate             |
| Build Tool | Maven                       |
| Docs       | Swagger (springdoc-openapi) |
| Deployment | Render                      |

---

# 📂 Project Structure

```
src/main/java/com/expensetracker
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── security
 ├── dto
 ├── exception
 └── ExpenseTrackerBackendApplication.java
```

---

# ⚙️ Local Setup

## 1️⃣ Clone project

```
git clone <https://github.com/variables-dev-coder/expense-tracker-backend>
cd expense-tracker-backend
```

## 2️⃣ Start PostgreSQL

Create database:

```
expense_tracker
```

## 3️⃣ Configure properties

`application.properties` already supports local + cloud:

```
spring.datasource.url=${DB_URL:jdbc:postgresql://localhost:5432/expense_tracker}
spring.datasource.username=${DB_USERNAME:postgres}
spring.datasource.password=${DB_PASSWORD:root}
```

## 4️⃣ Run app

```
mvn spring-boot:run
```

---

# 📖 API Documentation (Swagger)

After running:

```
http://localhost:8080/swagger-ui/index.html
```

Test all APIs directly in browser.

---

# 🔑 Authentication Flow

## Register

POST `/api/auth/register`

## Login

POST `/api/auth/login`

Response:

```
{
  "token": "JWT_TOKEN"
}
```

## Use token

Header:

```
Authorization: Bearer JWT_TOKEN
```

---

# 📡 Main Endpoints

| Method | Endpoint           | Description     |
| ------ | ------------------ | --------------- |
| POST   | /api/auth/register | Register user   |
| POST   | /api/auth/login    | Login           |
| GET    | /api/expenses      | Get my expenses |
| POST   | /api/expenses      | Add expense     |
| PUT    | /api/expenses/{id} | Update          |
| DELETE | /api/expenses/{id} | Delete          |

---

# ☁️ Deployment (Render)

## Steps

1. Create PostgreSQL on Render
2. Create Web Service
3. Add environment variables:

```
DB_URL
DB_USERNAME
DB_PASSWORD
```

4. Deploy

Example:

```
https://expense-tracker-api.onrender.com
```

Swagger:

```
https://expense-tracker-api.onrender.com/swagger-ui/index.html
```

---

# 🎯 Learning Outcomes

This project demonstrates:

* JWT authentication
* Spring Security filters
* REST API design
* JPA relationships
* Validation
* Exception handling
* Cloud deployment

---

# 👨‍💻 Author

Aziz
Backend Developer (Java + Spring Boot)

---

# ⭐ If you like this project

Give it a ⭐ on GitHub!
