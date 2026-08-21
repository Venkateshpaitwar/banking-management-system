package com.practice.banking;

/**
 * Abstract base class representing common state and behavior
 * shared by different types of bank accounts.
 *
 * Demonstrates abstraction, inheritance and polymorphism.
 */

public abstract class Account implements AccountOperations{

    // Common state shared by all account types
    private long account_no;
    protected double balance;
    private Customer customer;
    private AccountType accountType;

    // Initializes the common state of an Account
    public Account(long account_no, double balance, Customer customer, AccountType accountType) {
        this.account_no = account_no;
        this.balance = balance;
        this.customer = customer;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new InsufficientBalanceException("Amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }        balance -= amount;
    }

    // Abstract method: every concrete Account subclass must provide
    // its own implementation of interest calculation.
    public abstract void calculateInterest();

    // Getters
    public long getAccount_no() {
        return account_no;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public AccountType getAccountType() {
        return accountType;
    }

}