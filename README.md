# School Management Application API
This is an Individual project, I have worked on rest API service for an e-commerse Application in around 6-7 days. This service provides users to register and login, view/add products, and add to cart & order.

## Entity Relationship Diagram

[![ER Diagram](https://github.com/faterenuka/e-commerce-app/blob/main/Images/ER%20Diagram.png?raw=true)](https://github.com/faterenuka/e-commerce-app/blob/main/Images/ER%20Diagram.png?raw=true)


# Functionalities
-   User can register/login
-   See all products
-   Find products by category
-   Add to cart/edit into the cart
-   Place Order


## Backend Work
-  Proper Exception Handling
-  Proper Input Validation
-   Data Stored in the database(mySQL)
-   SignUp and Login

## Installation and Run
-  You can clone this repo and start the serve on localhost
-   Before running the API server, we should update the database config inside the application.properties file.
-   Update the port number, username and password as per our local database config.
```
server.port=8088
spring.datasource.url=jdbc:mysql://localhost:3306/schooldb
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=**YourPassword**
spring.jpa.hibernate.ddl-auto=update
```
# Tech Stacks

-   Java Core
-   Spring Data JPA
-   Spring Boot
-   Hibernate
-   MySQL

### Student
```
{
  "id": 6,
  "name": "Swapnil",
  "subjects": [
    {
      "id": 5,
      "name": "maths"
    }
  ]
}

### Teacher
```
{
  "id": 7,
  "first_name": "Renuka",
  "last_name": "Fate",
  "subjects": [
    {
      "id": 5,
      "name": "maths"
    }
  ]
}

# Backend

## Swagger UI

## Student-Controller
[![SwaggerUI](https://github.com/faterenuka/SchoolManagement/blob/main/ControllerImages/StudentController.png?raw=true)](https://github.com/faterenuka/SchoolManagement/blob/main/ControllerImages/StudentController.png?raw=true)

## Subject-Controller
[![SwaggerUI](https://github.com/faterenuka/SchoolManagement/blob/main/ControllerImages/SubjectController.png?raw=true)](https://github.com/faterenuka/SchoolManagement/blob/main/ControllerImages/SubjectController.png?raw=true)

## Teacher-Controller
[![SwaggerUI](https://github.com/faterenuka/SchoolManagement/blob/main/ControllerImages/TeacherController.png?raw=true)](https://github.com/faterenuka/SchoolManagement/blob/main/ControllerImages/TeacherController.png?raw=true)

## Thank You!for your time :)
[![SwaggerUI](https://allfreethankyounotes.com/wp-content/uploads/2021/08/all-free-thank-you-gif-6.gif)
