package com.sadhak.corejava.loopcontrol;

import java.util.Scanner;

public class ATMSystem {

    // Instance variable to hold the array of bank users
    private BankUser bankATMUsers[];

    // Constructor to initialize the ATM system with an array of bank users
    public ATMSystem(BankUser[] _bankATMUsers) {
        this.bankATMUsers = _bankATMUsers;
    }

    // Method to display the list of ATM users
    // This method iterates through the array of bank users and prints their names
    public void displayATMUsers() {
        System.out.println(" -------ATM Users------- ");
        for (BankUser user : bankATMUsers) {
            System.out.println("User Name: " + user.getUserName());
            System.out.println(" ----------------- ");
        }
    }

    Scanner scanner = new Scanner(System.in);

    // Method to start the ATM system
    public void startATM() {
        BankUser currentUser = null;
        // Loop until a valid user is found
        while (true) {
            System.out.println("Welcome to the ATM System!");
            displayATMUsers();
            System.out.print("Enter your ATM Pin: ");
            int enteredPin = scanner.nextInt();

            // Check if the entered pin matches any user's ATM pin
            for (BankUser user : bankATMUsers) {
                if (user.getUserATMPin() == enteredPin) {
                    currentUser = user;
                    break;
                }
            }

            // If a valid user is found, break the loop
            if (currentUser != null) {
                System.out.println("Welcome " + currentUser.getUserName() + "!");
                break;
            } else {
                System.out.println("Invalid ATM Pin. Please try again.");
            }
        }
        int choice;
        do {
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            // Perform actions based on user's choice
            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: " + currentUser.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    if (withdrawAmount <= currentUser.getBalance()) {
                        currentUser.withdraw(withdrawAmount);
                        System.out.println("Withdrawal successful! New balance: " + currentUser.getBalance());
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    currentUser.deposit(depositAmount);
                    System.out.println("Deposit successful! New balance: " + currentUser.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

    }

}
