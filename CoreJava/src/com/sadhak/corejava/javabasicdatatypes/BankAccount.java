package com.sadhak.corejava.javabasicdatatypes;

public class BankAccount {

    // Instance variables for account details
    // Static variables are shared across all instances of the class
    public static String bankName = "National Bank";
    private static int totalAccounts = 0;

    // Final variable for account number, cannot be changed after initialization
    private final int accountNumber;

    // Instance variables for various data types
    // Using primitive data types for account details
    private byte branchCode;
    private short atmPin;
    private long customerID;
    private int customerAge;
    private float interestRate;
    private double balance;
    private boolean isActive;
    private char accountType;
    private String accountHolderName;

    // Constructor to initialize the bank account
    public BankAccount(byte branchCode, short atmPin, long customerID, int customerAge,
            float interestRate, char accountType, int accountNumber, String accountHolderName,
            double initialBalance) {
        this.branchCode = branchCode;
        this.atmPin = atmPin;
        this.customerID = customerID;
        this.customerAge = customerAge;
        this.interestRate = interestRate;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.isActive = true;
        totalAccounts++;
    }

    // Methods to display account details
    public void displayAccountSummary() {
        System.out.println(" -------Account Summary------- ");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("Branch Code: " + branchCode);
        System.out.println("ATM Pin: " + atmPin);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer Age: " + customerAge);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Is Active: " + isActive);
        System.out.println(" ----------------- ");
    }

    // Getter methods for accessing static and instance variables one by one
    public static String getBankName() {
        return bankName;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public byte getBranchCode() {
        return branchCode;
    }

    public short getAtmPin() {
        return atmPin;
    }

    public long getCustomerID() {
        return customerID;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public char getAccountType() {
        return accountType;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Method to change the account status
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

}
