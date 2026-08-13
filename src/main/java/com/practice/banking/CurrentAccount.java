package com.practice.banking;

public class CurrentAccount extends Account{

    public CurrentAccount(long account_no, double balance, Customer customer, AccountType accountType) {
        super(account_no, balance, customer, accountType);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current accounts donot earn interests");
    }
}
