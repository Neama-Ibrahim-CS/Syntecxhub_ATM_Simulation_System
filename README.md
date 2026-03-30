# Syntecxhub ATM Simulation System 🏧

A professional Java-based ATM simulation system developed during the **Java Developer Internship** at **Syntecxhub**. This project focuses on applying core programming principles and building a robust, error-resistant application.

---

## 🚀 Key Features

* **Secure Authentication**: Includes **PIN Verification** (التحقق من الرقم السري) to simulate real-world security.
* **Account Management**: Perform basic banking operations such as **Balance Inquiry**, **Cash Withdrawal**, and **Deposits**.
* **Validation Rules**: Ensures the balance never drops below zero and verifies all transaction limits.
* **Session Stability**: Uses the `finally` block to ensure the session ends gracefully and resources are closed correctly.

---

## 🛠 Technical Concepts Applied

To ensure the system is **Robust** (متين) and maintainable, the following concepts were implemented:

### 1. Object-Oriented Programming (OOP)
* **Encapsulation** (التغليف): Used to protect sensitive data like `balance` and `pin` within the `Account` class, allowing access only through controlled methods.
* **Modular Design**: Separated logic into distinct classes (Account, ATMController, Exceptions) for better organization.

### 2. Exception Handling (Try-Catch)
The system implements comprehensive **Exception Handling** (معالجة الاستثناءات) to manage runtime errors without crashing the application:
* `InvalidPinException`: Handles incorrect security code entries.
* `InsufficientFundsException`: Triggered when a withdrawal exceeds the available balance.
* `InputMismatchException`: Manages cases where the user enters invalid data types (e.g., text instead of numbers).

---

## 💻 How to Run

1.  Clone this repository to your local machine.
2.  Open the project in any Java IDE (IntelliJ IDEA, Eclipse, or VS Code).
3.  Run the `ATMSystem.java` file.
4.  Follow the prompts in the console to test the ATM features.

---

## 🌟 About the Author
**Developed by: Neama Ibrahim**
*Computer Science Student at Al-Azhar University*
*Java Developer Intern at Syntecxhub*

> "Consistency is better than perfection." 🌸

---
