package com.practice.banking;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Venkatesh", "vp@gmail.com");
        Customer c2 = new Customer(2, "Srushti", "sa@gmail.com");

        Bank bank = new Bank();

        bank.addCustomer(c1);
        bank.addCustomer(c2);

        Customer foundCustomer = bank.findByCustomerId(1);

        if (foundCustomer != null) {
            System.out.println("Customer found:");
            System.out.println("ID: " + foundCustomer.getCustomerId());
            System.out.println("Name: " + foundCustomer.getName());
            System.out.println("Email: " + foundCustomer.getEmail());
        } else {
            System.out.println("Customer not found.");
        }

    }
}