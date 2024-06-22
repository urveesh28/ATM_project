# ATM_project
### ATM Project Description

#### Overview

The ATM project is a simple simulation of an Automated Teller Machine (ATM) system, built using Java. The system allows users to perform basic banking operations such as checking their account balance, depositing money, and withdrawing money. The project is designed to illustrate the fundamental principles of object-oriented programming in Java and provides a foundational understanding of how an ATM system operates.

#### Classes

1. **ATM.java**: This is the main class that contains the core logic of the ATM system. It handles user interactions, displays the menu, processes user input, and performs operations based on the user's choices.

2. **BankAccount.java**: This class represents a bank account. It contains attributes for the account holder (user) and the account balance. It provides methods for depositing and withdrawing money, as well as checking the account balance.

3. **User.java**: This class represents a user of the ATM. It includes attributes for the user's name and PIN (Personal Identification Number). It provides methods to retrieve the user's name and PIN for authentication purposes.

#### Features

- **Authentication**: Users must enter a correct PIN to access their account.
- **Check Balance**: Users can view their current account balance.
- **Deposit Money**: Users can deposit money into their account.
- **Withdraw Money**: Users can withdraw money from their account, subject to available balance.
- **User Interface**: A simple text-based interface allows users to interact with the ATM system through a console.

#### Dependencies

This project does not rely on any external libraries or frameworks. It uses standard Java libraries and follows basic Java programming practices. Below are the core dependencies:

- **Java Development Kit (JDK)**: The project requires JDK 8 or later versions to compile and run the Java code.
- **Scanner Class**: Used for reading user input from the console. It is part of the `java.util` package, which is included in the JDK.

#### Project Structure

The project is organized into three primary files, each representing a different class:

1. **ATM.java**
2. **BankAccount.java**
3. **User.java**

#### Running the Project

To run the project, follow these steps:

1. **Compile the Java Files**: Use the `javac` command to compile the Java files. Ensure all three files are in the same directory.
   ```sh
   javac ATM.java BankAccount.java User.java
   ```

2. **Run the Main Class**: Execute the compiled `ATM` class to start the ATM system.
   ```sh
   java ATM
   ```

#### Example Session

Here is an example session of how the ATM system works:

1. The user is prompted to enter their PIN.
2. Upon successful authentication, the user is presented with a menu of options.
3. The user can choose to check their balance, deposit money, withdraw money, or quit the system.
4. The system performs the requested operation and provides feedback to the user.
5. The session ends when the user chooses to quit.

#### Conclusion

This ATM project is a straightforward implementation designed to demonstrate basic concepts of object-oriented programming in Java. It covers essential operations of an ATM and provides a foundation for building more complex banking applications. The project can be extended to include additional features such as multiple user accounts, transaction history, and improved security measures.
