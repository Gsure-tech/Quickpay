# Quickpay 
Welcome to the Quickpay Financial Application project! This application allows users to sign up, create an account with a generated account number, activate their account via email, credit their wallet, and send money to other users with valid account numbers. It is built using Spring Security for security and uses MySQL as the database.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [Configuration](#configuration)
- [Contributing](#contributing)

## Features

- User Signup: Users can sign up and create an account with a unique account number.
- Email Activation: Accounts are activated via email confirmation.
- Wallet Credit: Users can deposit funds into their wallet.
- Money Transfer: Users can send money to other users using their account numbers.
- Security: Spring Security is used to secure the application.

## Getting Started

### Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK)
- MySQL Database
- Maven

### Installation

1. Clone the repository:

   ```sh
   git clone https://github.com/Gsure-tech/Quickpay.git


Configure your MySQL database settings in application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/yourdb
spring.datasource.username=yourusername
spring.datasource.password=yourpassword

Build and run the application:
mvn clean install
mvn spring-boot:run

### Usage
Sign up for an account and activate it via email.
Log in with your credentials.
Credit your wallet by depositing funds.
Send money to another user by specifying their account number.

### Configuration
You can customize the application's configuration by modifying the application.properties file. For example, you can configure email settings for account activation or specify additional security settings.

### Contributing
Contributions are welcome! If you'd like to contribute to this project, please follow these guidelines:

Fork the project.
Create a new branch for your feature or bug fix.
Make your changes and test thoroughly.
Create a pull request with a detailed description of your changes.








