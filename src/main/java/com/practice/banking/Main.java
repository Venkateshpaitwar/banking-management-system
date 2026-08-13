package com.practice.banking;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Venkatesh", "vp@gmail.com");
        Customer c2 = new Customer(2, "Srushti", "sa@gmail.com");
        Customer c3 = new Customer(1, "Venkatesh", "vp@gmail.com");

        Set<Customer> customers = new HashSet<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        System.out.println("Size: " + customers.size());
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

        bank.addAccount(savings);
        bank.addAccount(current);

        savings.calculateInterest();
        current.calculateInterest();

        Account foundAccount = bank.findAccountByNumber(1234567890L);

        if (foundAccount != null) {
            System.out.println("Account found:");
            System.out.println("Account Number: " + foundAccount.getAccount_no());
            System.out.println("Balance: " + foundAccount.getBalance());
        }

    }
}