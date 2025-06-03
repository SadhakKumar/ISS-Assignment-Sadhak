package com.sadhak.corejava.exceptionhandling;

/**
 * Custom exception to handle invalid card scenarios.
 * This exception is thrown when a payment attempt is made with an invalid card
 * number.
 */
public class InvalidCardException extends Exception {
    public InvalidCardException(String message) {
        // Call the constructor of the superclass (Exception) with the error message
        super(message);
    }
}
