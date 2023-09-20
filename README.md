# Student-Management-App

## Introduction

This simple Student Application allows users to add and view student information. The application has a backend built with Spring Boot and a frontend developed using React, React hooks and Material UI. It uses MySQL as the database to store student data. Postman API is used for testing the backend API endpoints. XAMPP is used to run the MySQL server locally.

## Prerequisites

- Java Development Kit (JDK)
- Node.js and npm (for React)
- MySQL Database
- XAMPP or a similar tool for managing MySQL locally

## Getting Started

### Backend

1. Open the 'StudentApplicationbackend' project. 
2. Or Use Spring Initializer to create a new Spring Boot project with Maven. Choose the necessary dependencies, including Spring Web and Spring Data JPA, MySQL.
3. Configure your MySQL database connection in the `application.properties` file, located in the `src/main/resources` directory. Modify the `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` properties to match your database setup. 
4. Build and run the Spring Boot Application.

### Frontend

1. Open the student-frontend project in Visual Studio Code or your preferred code editor.
2. Start the React development server:
   ```npm start```

## Usage
Once both the backend and frontend are running, you can access the Student Application in your web browser. By default, the front end will run on http://localhost:3000, and the back end will run on http://localhost:8080.

Open your web browser and navigate to http://localhost:3000 to access the application.

Use the application to add, view, and manage student information.

## API Documentation
You can use Postman or any similar API testing tool to interact with the backend API. The API endpoints can be tested using Postman.

## Database
This application uses MySQL as the database to store student information. You can use XAMPP or another MySQL management tool to access and manage the database.

## License
This project is licensed under the MIT License. 
