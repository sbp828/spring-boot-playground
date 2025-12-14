# User REST API

A simple Spring Boot project with H2 database to manage Users.

## Features

- Create User
- Get all Users
- Get User by ID
- H2 in-memory database

## How to Run

\`\`\`bash
mvn clean install
mvn spring-boot:run
\`\`\`

API endpoints:

- POST /users → create user  
- GET /users → get all users  
- GET /users/{id} → get user by id

H2 console: http://localhost:8081/h2-console
