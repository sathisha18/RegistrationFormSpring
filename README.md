Registartion-Form_Numetry
Registartion form for the Numetry

User Registration Application
This project is a user registration application built using Spring Boot, Spring Data JPA, Thymeleaf, and Hibernate Validator. It allows users to register by providing their details, which are then validated and saved to a database.

Technologies Used:
Spring Boot: Simplifies the development of stand-alone, production-grade Spring applications.
Spring Data JPA: Provides easy integration with relational databases and simplifies data access using JPA.
Thymeleaf: A server-side Java template engine for web applications, used to render HTML views.
Hibernate Validator: Implements Java Bean Validation (JSR 380) for enforcing validation constraints on object properties.
MySQL: A relational database management system used to store user information.
HTML: The standard markup language for creating web pages and web applications.
CSS(Bootstrap): A stylesheet language used for describing the presentation of a document written in HTML.
Key Components:
Entity Class (User):
Represents the user data model.
Includes fields like fill name , mobile no ,email,username,password.
Uses validation annotations to enforce constraints such as:
Username must be between 4 to 15 characters.
Email must be valid and contain an @ symbol.
Phone number must be 10 digits long and start with 7, 8, or 9.
Password and confirm password must match.
Repository Interface (UserRepository):
Extends JpaRepository to provide CRUD operations for User entities.
Allows interaction with the database to save and retrieve user data.
Controller Class (UserController):
Handles HTTP requests for user registration and displaying the list of registered users.
Provides methods to display the registration form, handle form submissions, validate input, and save user data to the database.
Ensures that password and confirm password match before saving the user.
Thymeleaf Templates:
register.html: A form for user registration with fields for username, email, phone number, password, confirm password, and gender. Includes error messages and validation feedback.
user.html: Displays a list of registered users in a table format.
styles.css: The displayed UI in the structurer format.
Application Flow:
User Registration:
The user accesses the registration page and fills out the form.
The form submission triggers validation of user input.
If validation passes and passwords match, the user data is saved to the database.
If validation fails or passwords do not match, appropriate error messages are displayed.
Display Registered Users:
The application provides a page that lists all registered users, displaying their details in a tabular format.
This project demonstrates how to build a simple, yet functional user registration system using Spring Boot and related technologies, ensuring robust validation and smooth user experience.
