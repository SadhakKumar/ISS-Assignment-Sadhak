package com.sadhak.corejava.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        try {
            // Attempt to process a payment with an invalid card number
            paymentProcessor.processPayment("1234567890123456", 5000.0);
            System.out.println("Current Balance: ₹" + paymentProcessor.getBalance());

            // Attempt to process a payment with insufficient balance
            paymentProcessor.processPayment("1234567890123456", 6000.0);
        } catch (InvalidCardException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some unexpected error occurred: " + e.getMessage());

        } finally {
            System.out.println("Final balance: ₹" + paymentProcessor.getBalance());
            System.out.println("Transaction attempt complete.");
        }

    }
}
