# PHP Login System

This PHP application is a simple login system that validates user credentials (name and email) against data stored in a MySQL database. Successful logins are redirected to a welcome page.

## Project Structure

- `connection.php`: Establishes a connection to the MySQL database.
- `login.php`: The login form and PHP logic for authenticating user credentials.
- `welcome.php`: A welcome page displayed upon successful login.
- `register.php`: Link to the registration page (not included here).
- `style5.css`: CSS file for styling the login form.

## Features

- **User Authentication**: Verifies the user's name and email from the database.
- **Session Management**: Stores user information in the session for the current login session.

## Requirements

- **PHP 7.x or higher**
- **MySQL Database**: Create a database named `projects` and a table `user_info` to store user credentials.

## Database Setup

1. Create a MySQL database named `projects`.
2. Create a table named `user_info` with the following columns:

   ```sql
   CREATE TABLE user_info (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(50) NOT NULL,
       email VARCHAR(50) NOT NULL UNIQUE
   );
   ```
