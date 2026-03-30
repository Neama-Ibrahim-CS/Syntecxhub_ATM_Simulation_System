/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;
 import java.util.Scanner;
public class ATM {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account myAccount = new Account("123456789", "2026", 1000.0);

        try {
            System.out.print("Enter PIN: ");
            String inputPin = scanner.nextLine();
         while(true){
            if (!myAccount.validPin(inputPin)) {
                throw new WrongPinException("Invalid PIN entered.");
            }

            System.out.println("1. Balance\n2. takeMoney\n3. putMoney");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: $" + myAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    myAccount.withdraw(amount);
                    break;
                case 3:
                    System.out.print("Enter amount: ");
                    double depAmount = scanner.nextDouble();
                    myAccount.deposit(depAmount);
                    break;
                default:
                    System.out.println("Invalid selection.");
            }
}

        } catch (WrongPinException | NoMoneyException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error occurred.");
        } finally {
            System.out.println("Please take your card. Goodbye!");
            scanner.close();
        }
    }
    }
    
