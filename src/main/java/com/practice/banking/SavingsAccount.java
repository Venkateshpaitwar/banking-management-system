package com.practice.banking;

public class SavingsAccount extends Account {

    public SavingsAccount(long account_no, double balance, Customer customer, AccountType accountType) {
        super(account_no, balance, customer, accountType);
    }

    @Override
    public void calculateInterest() {
        balance += 0.04 * balance;
        System.out.println("Savings interest calculated");
    }
}