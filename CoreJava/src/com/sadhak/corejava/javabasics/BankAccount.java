package com.sadhak.corejava.javabasics;

public class BankAccount {

    // Instance variables for account details
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the bank account
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Methods to deposit and withdraw money
    /**
     * Deposits a specified amount into the bank account.
     *
     * @param amount The amount to deposit, must be positive.
     */
    public void depositAmount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    /**
     * Withdraws a specified amount from the bank account.
     *
     * @param amount The amount to withdraw, must be positive and not exceed the
     *               current balance.
     */
    public void withdrawAmount(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Getters for account details

    // Returns the current balance of the account.
    public double getBalance() {
        return balance;
    }

    // Returns the account number of the bank account.
    public String getAccountNumber() {
        return accountNumber;
    }

    // Returns the name of the account holder.
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Method to display account details
    public void displayAllAccountDetails() {
    	System.out.println("--------Account Details--------");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

}
