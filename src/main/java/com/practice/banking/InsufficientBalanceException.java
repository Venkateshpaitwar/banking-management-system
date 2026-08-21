package com.practice.banking;

// This is custom unchecked exception created
public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
