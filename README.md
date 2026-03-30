# 📚 Library Management System (Spring Boot & OOP)

## 🎯 Project Objective
The purpose of this project is to apply core **Object-Oriented Programming (OOP)** concepts within a functional Java Spring Boot backend. 

## 🛠 OOP Implementation
- **Inheritance:** The `Book` class extends the `LibraryItem` class, inheriting common attributes like `id` and `title`.
- **Encapsulation:** All model fields are `private` and accessed through public `Getters` and `Setters`.
- **Layered Architecture:** - **Controller:** Handles REST API requests.
  - **Service:** Contains the business logic and data management.
  - **Model:** Defines the data structures (`Book`, `LibraryItem`).

## 🚀 How to Run Locally
1. Ensure you have **Java 17+** and **Maven** installed.
2. Open the project folder in your terminal.
3. Run the command: `mvn spring-boot:run`
4. Wait for the terminal to show: `Started LibraryManagementSystemApplication`.

## 🧪 Testing the API
Once the application is running, you can test it in Chrome:

1. **View All Books (JSON):** [http://localhost:8080/api/library/books](http://localhost:8080/api/library/books)
2. **Interactive UI (Swagger):** [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## 📋 API Endpoints
- `GET /api/library/books` - Retrieve the list of books.
- `POST /api/library/books` - Add a new book (requires JSON body).
- `PUT /api/library/books/{id}` - Update an existing book.
- `DELETE /api/library/books/{id}` - Remove a book from the list.
