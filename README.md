# Recipe Management System - Project Overview

A multi-user RESTful web service built with **Spring Boot** to store, retrieve, update, and delete cooking recipes. Developed as part of the **JetBrains Academy / Hyperskill** backend curriculum.

## Tech Stack
* **Java 17+**
* **Spring Boot** (Web, Data JPA, Security)
* **H2 Database** (In-memory database for development)
* **Spring Validation** (For robust request payload checks)
* **Maven** (Build and dependency management)

## Project Stages
1. **First Recipe:** Implement a basic JSON API to add and retrieve single recipes.
2. **Multiple Recipes:** Expand endpoints to handle collections of recipes dynamically.
3. **Store a Recipe:** Integrate an H2 database and implement recipe deletion.
4. **Sort & Update:** Add search capabilities (by name/category) and update existing records.
5. **User Registration & Security:** Secure endpoints with Spring Security and restrict updates/deletions to recipe owners.

## API Endpoints Overview
* `POST /api/recipe/new` - Add a new recipe (Authenticated users)
* `GET /api/recipe/{id}` - Get a recipe by ID
* `GET /api/recipe/search?category=...` or `?name=...` - Search recipes
* `PUT /api/recipe/{id}` - Update a recipe (Owner only)
* `DELETE /api/recipe/{id}` - Delete a recipe (Owner only)
* `POST /api/register` - Register a new user account

### Running Locally
1. Clone the repository:
   ```bash
   git clone https://github.com
   ```
2. Navigate to the project directory:
   ```bash
   cd recipe-management-system
   ```
3. Build and run the application using Maven:
   ```bash
   mvn spring-boot:run
   ```
The server will start on `http://localhost:8080`.

