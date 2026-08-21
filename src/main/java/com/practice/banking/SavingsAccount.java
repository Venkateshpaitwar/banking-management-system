package com.practice.banking;

public class SavingsAccount extends Account {

    // Inheritance: SavingsAccount IS-A Account.
    // super() invokes the parent class constructor.
    public SavingsAccount(long account_no, double balance, Customer customer, AccountType accountType) {
        super(account_no, balance, customer, accountType);
    }

    // Runtime polymorphism
    @Override
    public void calculateInterest() {
        balance += 0.04 * balance;
        System.out.println("Savings interest calculated");
    }
}