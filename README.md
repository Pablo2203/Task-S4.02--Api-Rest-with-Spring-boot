# 🍎 CRUD with Three Databases: H2, MySQL, and MongoDB

## 📄 Description

This project consists of implementing a **CRUD (Create, Read, Update, Delete)** application using three different databases: **H2**, **MySQL**, and **MongoDB**. The task is divided into three levels:

1. **Level 1:** CRUD with **H2** (in-memory database)
2. **Level 2:** CRUD with **MySQL**
3. **Level 3:** CRUD with **MongoDB**

The project will adhere to **HTTP best practices** for API design, properly handling HTTP verbs and status codes. Additionally, it includes a **GlobalExceptionHandler** for centralized error handling to improve robustness.

## 💻 Technologies Used

- **Java 21+** 
- **Spring Boot** (latest stable version)
  - Spring Web
  - Spring Data JPA
  - Spring Data MongoDB
  - Spring Boot DevTools
- **H2 Database** (in-memory database)
- **MySQL**
- **MongoDB**
- **Maven/Gradle** (dependency management)
- **Postman** (for API testing)
- **Git** (version control)

## 📋 Requirements

Ensure the following tools are installed in your environment:

- **JDK 21 or higher**
- **Maven** or **Gradle**
- **MySQL** installed locally or cloud-configured
- **MongoDB** installed locally (default port: `27017`) or cloud-configured
- **Postman** or another API testing tool
- **Integrated Development Environment (IDE):** IntelliJ IDEA, Eclipse, or similar

## 🛠️ Installation

1. Clone this repository:
   ```bash
   git clone <repository_link>
   cd <repository_folder>
   ```

2. Open the project in your preferred IDE.

3. Modify the database configuration in the corresponding `application.properties` file, depending on the database you want to use. See the **Database Configuration** section below.

4. Install the dependencies:
   ```bash
   ./mvnw install
   ```

## ▶️ Execution

1. Start the Spring Boot application (the default server runs on `http://localhost:8080`):
   ```bash
   ./mvnw spring-boot:run
   ```
2. Use the provided endpoints for CRUD operations:

   - Create a new fruit:
     ```
     POST http://localhost:8080/fruta/add
     ```
   - Update an existing fruit:
     ```
     PUT http://localhost:8080/fruta/update
     ```
   - Delete a fruit by ID:
     ```
     DELETE http://localhost:8080/fruta/delete/{id}
     ```
   - Retrieve a single fruit by ID:
     ```
     GET http://localhost:8080/fruta/getOne/{id}
     ```
   - Retrieve all fruits:
     ```
     GET http://localhost:8080/fruta/getAll
     ```

3. Use **Postman** to test these endpoints, passing JSON data in the request body where applicable.

## 🌐 Deployment

For production-ready deployment, you will need to:

1. Configure a **production database instance** (H2 is lightweight and not recommended for production).
2. Use a server like **Tomcat** or cloud services like **AWS**, **Azure**, or **Heroku** for deployment.
3. Use environment-specific properties for production configuration.

## 🔄 Database Configuration Guide

The `application.properties` file contains separate configurations for H2, MySQL, and MongoDB. Update the following fields depending on the database you want to activate:

### Switching Between Databases
Uncomment the appropriate `spring.profiles.active` property:

```properties
# Activate the specific profile by uncommenting:
spring.profiles.active=h2   # For H2 Database
#spring.profiles.active=mysql   # For MySQL
#spring.profiles.active=mongo   # For MongoDB
```

### H2 Configuration

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
```

### MySQL Configuration

```properties
spring.datasource.url=jdbc:mysql://localhost:3307/fruit_bd?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=teclado123
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true  # Set to false in production for less logging
```

### MongoDB Configuration

```properties
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=fruit_bd
spring.data.mongodb.username=sa
spring.data.mongodb.password=teclado123
```

## 🤝 Contributions

Contributions are welcome! Follow these steps to contribute:

1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your message here"
   ```
4. Push to the branch:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Open a Pull Request.

Please ensure that your code adheres to the project's coding standards before submitting.

---

If you found this project useful, feel free to give it a ⭐ on GitHub!
