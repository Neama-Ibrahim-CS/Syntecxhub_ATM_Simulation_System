/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

public class Account {
    
    private String accountNumber;
    private String pin;
    private double balance;

    public Account(String accountNumber, String pin, double initialBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = initialBalance;
    }
    public boolean validPin(String inputPin) {
        return this.pin.equals( inputPin);
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        }
    }
    public void withdraw(double amount) throws NoMoneyException {
        if (amount > balance) {
            throw new NoMoneyException("Insufficient funds. Current balance: $" + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: $" + amount);
    }
    
}
 
