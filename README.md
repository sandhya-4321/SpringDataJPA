
# Spring Data JPA - Employee Management System

## About the Project
This project is developed using Spring Boot and Spring Data JPA to perform CRUD operations on employee records. It demonstrates how to interact with a MySQL database using JpaRepository.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Eclipse IDE

## Features
- Add Employee
- Retrieve All Employees
- Find Employee By ID
- Update Employee Details
- Delete Employee
- Search Employee By Name
- Find Employees Based on Age
- Salary Transfer Between Employees
- Transaction Management using @Transactional

## Project Structure

    src/main/java
        └── com.springdatajpa.demo
              ├── Employee.java
              ├── EmployeeRepository.java
              ├── EmployeeService.java
              └── SpringDataJpaApplication.java

    src/main/resources
        └── application.properties

## Spring Data JPA Methods

| Method | Description |
|--------|-------------|
| save() | Save employee details |
| findAll() | Retrieve all employees |
| findById() | Find employee by ID |
| delete() | Delete employee |
| findByEname() | Search employee by name |
| findByAgeGreaterThanEqual() | Find employees by age |

## Transaction Management

Used @Transactional annotation to perform salary transfer between two employees.

- Deduct salary from sender.
- Add salary to receiver.
- Maintain transaction consistency.
- Rollback changes if an unchecked exception occurs.

## Database Configuration

Configure the MySQL database in application.properties.

    spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
    spring.datasource.username=root
    spring.datasource.password=your_password

    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true

## How to Run

1. Clone this repository.
2. Import the project into Eclipse or Spring Tool Suite.
3. Configure MySQL database credentials.
4. Start the MySQL server.
5. Run the Spring Boot application.
6. Test the employee operations.

## Learning Outcomes

- Understanding Spring Data JPA.
- Performing CRUD operations.
- Using JpaRepository.
- Implementing derived query methods.
- Understanding Hibernate.
- Implementing transaction management.

**Project:** Spring Data JPA Employee Management System
