# Spring MVC Demo

This project is my hands-on Spring Boot MVC practice app.  
I use it to build and understand the full flow of a Java web application using Spring MVC and Thymeleaf.

## What I Do In This Project

- Build a Spring Boot MVC application with clean package structure.
- Create controller logic to handle requests and return views.
- Implement a service layer for business logic (`WelcomeService`).
- Use a model object (`WelcomeMessage`) to pass data to the UI.
- Build and style a Thymeleaf template for the home page.
- Configure application properties like server port and template settings.
- Run and test the app using Maven.

## Current Features

- `GET /` endpoint renders a dynamic home page.
- Welcome text is generated through the service layer.
- Thymeleaf-based HTML view (`home.html`) with a modern responsive UI.
- App runs on port `8081`.

## Tech Stack

- Java 17
- Spring Boot 3.3.5
- Spring MVC
- Thymeleaf
- Maven
- JUnit 5

## How To Run

```bash
mvn spring-boot:run
```

Open: `http://localhost:8081/`

## Project Structure

```text
src/main/java/com/example/springmvcapp
|- controller/HomeController.java
|- service/WelcomeService.java
|- service/WelcomeServiceImpl.java
|- model/WelcomeMessage.java
|- view/ViewNames.java
|- SpringMvcAppApplication.java

src/main/resources
|- templates/home.html
|- application.properties
```

## Goal

My goal with this project is to strengthen Spring MVC fundamentals by practicing:

- MVC architecture and layer separation
- Dependency injection
- Template rendering with Thymeleaf
- Clean and maintainable Java project structure
