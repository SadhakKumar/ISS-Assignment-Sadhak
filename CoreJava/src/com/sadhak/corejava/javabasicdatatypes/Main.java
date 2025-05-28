package com.sadhak.corejava.javabasicdatatypes;

public class Main {

    public static void main(String[] args) {

        // Create a new bank account with various data types
        BankAccount userAccount = new BankAccount(
                (byte) 12,
                (short) 1234,
                9876543210L,
                30,
                3.5f,
                'S',
                123456789,
                "Sadhak Kumar",
                1500.75);

        // Display the account summary
        userAccount.displayAccountSummary();

        // Display static variables
        System.out.println("Bank Name: " + BankAccount.getBankName());
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());

        // Get and display individual account details
        System.out.println("Account Number: " + userAccount.getAccountNumber());
        System.out.println("Account Holder Name: " + userAccount.getAccountHolderName());
        System.out.println("Balance: " + userAccount.getBalance());
        System.out.println("Branch Code: " + userAccount.getBranchCode());
        System.out.println("ATM Pin: " + userAccount.getAtmPin());
        System.out.println("Customer ID: " + userAccount.getCustomerID());
        System.out.println("Customer Age: " + userAccount.getCustomerAge());
        System.out.println("Interest Rate: " + userAccount.getInterestRate());
        System.out.println("Is Active: " + userAccount.isActive());
        System.out.println("Account Type: " + userAccount.getAccountType());

        // Change the account status
        userAccount.setActive(false);
        System.out.println("Account Status changed to : " + userAccount.isActive());
    }
}
