package com.sadhak.corejava.exceptionhandling;

/**
 * Custom exception to handle invalid card scenarios.
 * This exception is thrown when a payment attempt is made when there is
 * insufficient balance in account.
 */
public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
