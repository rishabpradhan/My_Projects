# Bank Account Management System

This project is a basic Bank Account Management System implemented in Java. It provides functionalities for users to manage their checking and savings accounts, including checking balances, depositing funds, and withdrawing funds. This program is designed for demonstration purposes, showing a simple console-based banking system.

## Features

- **User Authentication**: User login with a unique ID and PIN.
- **Account Types**: Support for both checking and savings accounts.
- **Account Actions**:
  - **View Balance**: Check the current balance of the selected account.
  - **Deposit Funds**: Deposit money into the checking or savings account.
  - **Withdraw Funds**: Withdraw money from the checking or savings account.
  - **Exit**: Close the session.

## Project Structure

### Main Classes

- **main**: Holds basic user information, account balances, and core account operations like deposits and withdrawals.
- **Bank**: Extends the `main` class and contains user authentication, account selection, and transaction handling.

### Methods

- **User Authentication** (`check_user`): Allows a user to enter their ID and PIN to gain access to account functionalities.
- **Account Access** (`get_useracc`): Lets the user choose between checking or savings accounts and the action they want to perform.
- **Transaction Handling** (`get_checking_acc`, `get_saving_acc`): Provides options for viewing balance, withdrawing, depositing, and exiting for each account type.

## Getting Started

### Prerequisites

- **Java**: Ensure Java Development Kit (JDK) is installed.

### Running the Application

1. Compile the Java files:

   ```bash
   javac Bank.java main.java
   ```

2. Run the application:

   ```bash
   java Bank
   ```

3. Enter a valid User ID and PIN to access the account. Example IDs and PINs:

   - User ID: 984123, PIN: 1235
   - User ID: 982332, PIN: 1234

4. Follow the console prompts to perform transactions on either the checking or savings account.

## Example Usage

- **Login**: Enter User ID and PIN when prompted.
- **Select Account**: Choose between checking or savings accounts.
- **Perform Transactions**: View balance, deposit, or withdraw funds based on account type.

## Notes

- This system uses a basic HashMap to simulate user credentials for authentication.
- Ensure proper input values to avoid unexpected behavior.

## Usgage

This project is open-source and available for modification and redistribution,Under Rishab Pradhan.
