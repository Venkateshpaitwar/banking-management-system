package com.practice.banking;

public class CurrentAccount extends Account{

    // Inheritance: CurrentAccount IS-A Account.
    // super() invokes the parent class constructor.
    public CurrentAccount(long account_no, double balance, Customer customer, AccountType accountType) {
        super(account_no, balance, customer, accountType);
    }

    // Method overriding: provides the concrete implementation
    // of the abstract method declared in Account.
    @Override
    public void calculateInterest() {
        System.out.println("Current accounts donot earn interests");
    }
}
