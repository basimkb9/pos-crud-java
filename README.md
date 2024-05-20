# Point of Sale (POS) Application

This project is a backend application for a Point of Sale (POS) system, designed using Java Spring Boot and MySQL. The system manages sales transactions, tracks inventory, manages customers, and generates reports.

## Table of Contents

1. [Running the Application](#running-the-application)
2. [Requirements](#requirements)
3. [Project Setup](#project-setup)
4. [Database Configuration](#database-configuration)

## Requirements

- IntelliJ IDEA (Community Edition)
- MySQL Workbench
- Java 17 SDK
- Postman

## Running the Application

1. Open the project in IntelliJ IDEA.
2. Navigate to the PosApplication.java file.
3. Run the application like you normally do in your IDE.

## Project Setup

1. **Spring Initializr Setup:**
    - Go to [Spring Initializr](https://start.spring.io/)
    - Project: Maven
    - Language: Java
    - Spring Boot: 3.2.5 (or latest stable version)
    - Project Metadata:
        - Group: `com.maju`
        - Artifact: `pos`
        - Name: `pos`
        - Description: `Point of Sale Application for Spring Boot`
        - Package Name: `com.maju.pos`
        - Packaging: Jar
        - Java: 17

2. **Add Dependencies:**
    - Spring Web
    - Spring Data JPA
    - Lombok
    - MySQL Driver

3. **Generate the Project:**
    - Click on "Generate" to download the project.
    - Extract the downloaded project and open it in IntelliJ IDEA.

## Database Configuration

1. **Creating Database:**
    - Open MySQL Workbench.
    - Create a new connection with the following details:
        - Connection Name: `pos_db_connection`
        - Hostname: `localhost`
        - Port: `3306`
        - Username: `your_username`
        - Password: `your_password`

2. **Create Schema:**
    - Open the connection and create a new schema named `pos_db`.

3. **Application Properties:**
    - Configure the `application.properties` file as follows:

```properties
spring.application.name=pos

## MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/pos_db
spring.datasource.username=root
spring.datasource.password=your_password

#`hibernate_sequence' doesn't exist
spring.jpa.hibernate.use-new-id-generator-mappings=false

# Disable new identifier generator mappings
hibernate.id.new_generator_mappings=false

# drop n create table, good for testing, comment this in production
spring.jpa.hibernate.ddl-auto=create-drop
