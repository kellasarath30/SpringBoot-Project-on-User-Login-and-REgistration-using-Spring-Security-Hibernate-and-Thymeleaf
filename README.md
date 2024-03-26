User Login and Registration System using Spring Boot
This is a simple user login and registration system built using Spring Boot. It allows users to register for a new account, log in with their credentials, and access protected resources.

Features
User registration: New users can sign up for an account by providing a username, email, and password.
User login: Registered users can log in using their username/email and password.
Authentication: The application provides secure authentication using Spring Security.
Password hashing: User passwords are hashed before being stored in the database for enhanced security.
Access control: Certain resources are protected and can only be accessed by authenticated users.
Technologies Used
Java
Spring Boot
Spring Security
Thymeleaf (for front-end templates)
MySQL (or any other database of choice)
Setup Instructions
Clone the repository:

bash

git clone <repository-url>
Navigate to the project directory:

bash

cd user-login-registration-springboot
Update the database configurations in application.properties file:

properties

spring.datasource.url=jdbc:mysql://localhost:3306/mydatabase
spring.datasource.username=root
spring.datasource.password=password
Build the project:

bash

mvn clean install
Run the application:

bash

java -jar target/user-login-registration-springboot.jar
Access the application in your web browser:


Usage
Open the application in your web browser.
Click on the "Register" link to sign up for a new account.
Fill in the registration form with your details and submit.
Once registered, you can log in using your username/email and password.
After logging in, you will be redirected to the home page where you can access protected resources.


![Screenshot (17)](https://github.com/kellasarath30/SpringBoot-Project-on-User-Login-and-REgistration-using-Spring-Security-Hibernate-and-Thymeleaf/assets/102147901/ad101de4-3365-4ba2-aa90-73c72bd8542d)

![Screenshot (18)](https://github.com/kellasarath30/SpringBoot-Project-on-User-Login-and-REgistration-using-Spring-Security-Hibernate-and-Thymeleaf/assets/102147901/115b156d-c97b-46f3-be71-2a28a653d540)

![Screenshot (19)](https://github.com/kellasarath30/SpringBoot-Project-on-User-Login-and-REgistration-using-Spring-Security-Hibernate-and-Thymeleaf/assets/102147901/6385c433-de08-4100-ae10-a67800d86801)

![Screenshot (21)](https://github.com/kellasarath30/SpringBoot-Project-on-User-Login-and-REgistration-using-Spring-Security-Hibernate-and-Thymeleaf/assets/102147901/90691fce-49e5-4165-88f3-cf7b153e3777)

![Screenshot (20)](https://github.com/kellasarath30/SpringBoot-Project-on-User-Login-and-REgistration-using-Spring-Security-Hibernate-and-Thymeleaf/assets/102147901/c1ee8740-5063-428b-9d74-5a932016880b)

