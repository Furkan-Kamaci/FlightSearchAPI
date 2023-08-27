<div style="text-align: center;">

# TRAVEL TO FUTURE PROGRAM - AMADEUS

</div>

# Case Study: Flight Search API (backend development)

## Description

Welcome to the Flight Search Backend API documentation for our innovative flight application – your ultimate solution for seamless flight search services. This repository houses the core functionality of our application, providing robust features that empower users in their quest for the perfect flight.


## Features

- **Flight Search**: Our API offers a sophisticated flight search mechanism that enables users to explore a vast array of flight options based on their preferences.

- **CRUD Functionality**: We've meticulously designed endpoints for both Airport and Flight entities, allowing you to Create, Read, Update, and Delete essential data effortlessly.

- **Secure Authentication**: Security is our priority. Our API incorporates strong authentication protocols to safeguard user data and ensure a secure experience.


## Getting Started

Follow these steps to set up and run the Spring Boot backend API on your local machine:

1. **Clone the Repository**: Start by cloning this repository to your local machine:

```.sh
git clone https://github.com/Furkan-Kamaci/FlightSearchAPI.git
```

2. **Database Configuration**: The [application.properties](https://github.com/Furkan-Kamaci/FlightSearchAPI/blob/main/src/main/resources/application.properties) file contains the database parameters:

``` 
MYSQL_PORT:3306
MYSQL_USER:root
MYSQL_PASSWORD:1234
```

Feel free to modify these parameters as needed.

3. **Prepare the Database**: Execute the script located at 
   [mysqlScripts/initializeDatabase.sql](https://github.com/Furkan-Kamaci/FlightSearchAPI/blob/main/mysqlScripts/initializeDatabase.sql)


4. **Navigate to Project Directory**: Move into the cloned directory:

```.sh
cd FlightSearchAPI
```

6. **Run the Application**: Open a terminal/command prompt, navigate to the project directory, and then launch the Spring Boot application using the following command:
```.sh
mvnw spring-boot:run
```
7. **Explore API Endpoints**: Utilize tools like Postman or cURL or Swagger to interact with the API's endpoints. Refer to the detailed documentation below for endpoint information and request formats.

# API Documentation
For comprehensive information about available endpoints, request and response formats, authentication, and more, please refer to our Swagger API documentation.

```.sh
http://localhost:8080/swagger-ui/index.html
```