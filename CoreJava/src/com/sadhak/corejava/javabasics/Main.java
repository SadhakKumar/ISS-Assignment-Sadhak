package com.sadhak.corejava.javabasics;


public class Main {

	public static void main(String[] args) {

		// Create a new bank account
		BankAccount userAccount = new BankAccount("123456789", "Sadhak Kumar", 1000.0);

		// Display initial account details
		userAccount.displayAllAccountDetails();

		// Deposit money into the account
		userAccount.depositAmount(500.0);
		System.out.println("Balance after deposit: s" + userAccount.getBalance());

		// Withdraw money from the account
		userAccount.withdrawAmount(200.0);
		System.out.println("Balance after withdrawal: " + userAccount.getBalance());

		// Attempt to withdraw more than the balance
		userAccount.withdrawAmount(1500.0);
		System.out.println("Balance after invalid withdrawal: " + userAccount.getBalance());

		// Display final account details
		userAccount.displayAllAccountDetails();

	}

}
