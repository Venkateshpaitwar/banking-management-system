package com.practice.banking;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Venkatesh", "vp@gmail.com");
        Customer c2 = new Customer(2, "Srushti", "sa@gmail.com");

        Bank bank = new Bank();

        bank.addCustomer(c1);
        bank.addCustomer(c2);

        // finding a customer by id
        Customer foundCustomer = bank.findByCustomerId(1);

        if (foundCustomer != null) {
            System.out.println("Customer found:");
            System.out.println("ID: " + foundCustomer.getCustomerId());
            System.out.println("Name: " + foundCustomer.getName());
            System.out.println("Email: " + foundCustomer.getEmail());
        } else {
            System.out.println("Customer not found.");
        }

        Account savings = new SavingsAccount(1234567890, 1000000.00, c1);
        Account current = new CurrentAccount(1987654321, 5744972.23, c2);

        savings.calculateInterest();
        current.calculateInterest();
    }
}