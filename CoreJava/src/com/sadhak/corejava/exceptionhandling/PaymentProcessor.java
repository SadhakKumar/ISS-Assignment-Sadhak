package com.sadhak.corejava.exceptionhandling;

public class PaymentProcessor {
    private double accountBalance = 10000.0;

    public void processPayment(String cardNumber, double amount) throws InvalidCardException {
        // Check if card number is valid
        if (cardNumber == null || cardNumber.length() != 16) {
            throw new InvalidCardException("Invalid card number.");
        }
        // Check if the amount is valid
        if (amount > accountBalance) {
            throw new InsufficientBalanceException("Not enough balance in the account.");
        }

        accountBalance -= amount;
        System.out.println("Payment of ₹" + amount + " processed successfully.");
    }

    public double getBalance() {
        return accountBalance;
    }
}
