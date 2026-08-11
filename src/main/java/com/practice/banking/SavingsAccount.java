package com.practice.banking;

public class SavingsAccount extends Account {

    public SavingsAccount(long account_no, double balance, Customer customer) {
        super(account_no, balance, customer);
    }

    @Override
    public void calculateInterest() {
        balance += 0.04 * balance;
        System.out.println("Savings interest calculated");
    }
}