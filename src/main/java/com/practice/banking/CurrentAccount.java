package com.practice.banking;

public class CurrentAccount extends Account{

    public CurrentAccount(long account_no, double balance, Customer customer) {
        super(account_no, balance, customer);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current accounts donot earn interests");
    }
}
