package com.sadhak.corejava.loopcontrol;

public class BankUser {

    // Instance variables for bank user details
    private final int userATMPin;
    private final String userName;
    private int userAccountBalance;

    // Constructor to initialize the bank user
    public BankUser(int userATMPin, String userName, int initialBalance) {
        this.userATMPin = userATMPin;
        this.userName = userName;
        this.userAccountBalance = initialBalance;
    }

    // Getter methods to access user details
    public int getUserATMPin() {
        return userATMPin;
    }

    public String getUserName() {
        return userName;
    }

    public int getBalance() {
        return userAccountBalance;
    }

    // Methods to perform banking operations
    // Methods to deposit money from the user account
    public void deposit(int amount) {
        if (amount > 0) {
            userAccountBalance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the user account
    public void withdraw(int amount) {
        if (amount > 0 && amount <= userAccountBalance) {
            userAccountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient userAccountBalance.");
        }
    }

}
