package com.practice.banking;

public abstract class Account implements AccountOperations{

    private long account_no;
    protected double balance;
    private Customer customer;

    public Account(long account_no, double balance, Customer customer) {
        this.account_no = account_no;
        this.balance = balance;
        this.customer = customer;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract void calculateInterest();

    public long getAccount_no() {
        return account_no;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

}