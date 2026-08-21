package com.practice.banking;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Object creation using constructors
        Customer c1 = new Customer(1, "Venkatesh", "vp@gmail.com");
        Customer c2 = new Customer(2, "Srushti", "sa@gmail.com");
        Customer c3 = new Customer(1, "Venkatesh", "vp@gmail.com");

        /*
         * Generics:
         * Set<Customer> provides type safety.
         *
         * HashSet:
         * Uses hashCode() and equals() to identify duplicates.
         *
         * c1 and c3 are logically equal because their customerId is same,
         * so only one of them is stored.
         */
        Set<Customer> customers = new HashSet<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        System.out.println("Size: " + customers.size());
        Bank bank = new Bank();

        // Aggregation:
        // Bank maintains references to Customer objects.
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

        /*
         * Abstraction:
         * Account is an abstract parent class.
         *
         * Polymorphism:
         * Account reference can refer to different Account subclasses.
         */
        Account savings = new SavingsAccount(1234567890, 1000000.00, c1, AccountType.SAVINGS);
        Account current = new CurrentAccount(1987654321, 5744972.23, c2, AccountType.CURRENT );
        Account savings2 = new SavingsAccount(1234543211, 40541049.99, c3, AccountType.SAVINGS);

        // Polymorphic collection: List<Account> can hold different subclasses.
        bank.addAccount(savings);
        bank.addAccount(current);

        /*
         * Runtime Polymorphism / Dynamic Method Dispatch:
         * JVM executes the overridden method based on the actual object type.
         */
        savings.calculateInterest();
        current.calculateInterest();

        Account foundAccount = bank.findAccountByNumber(1234567890L);

        if (foundAccount != null) {
            System.out.println("Account found:");
            System.out.println("Account Number: " + foundAccount.getAccount_no());
            System.out.println("Balance: " + foundAccount.getBalance());
        }

        // Enum:
        // AccountType restricts account type to predefined constants.
        System.out.println(savings.getAccountType());
        System.out.println(current.getAccountType());


        // Exception handling :try-catch handles a custom unchecked exception.
        try{
            savings.withdraw(2043789032870.00);
        }catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }

    }
}