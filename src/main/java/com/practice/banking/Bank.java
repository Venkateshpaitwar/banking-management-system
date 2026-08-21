package com.practice.banking;

import java.util.ArrayList;
import java.util.List;

/*
 * Represents a bank that manages customers and accounts.
 *
 * Demonstrates:
 * - Association/Aggregation
 * - Collections
 * - Generics
 * - Encapsulation
 */

public class Bank {

    // Bank maintains a collection of customers.
    private List<Customer> customersList = new ArrayList<>();
    // Bank maintains a collection of accounts.
    // Account is the parent type, so this list can hold
    // SavingsAccount, CurrentAccount, etc.
    private List<Account> accountsList = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customersList.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customersList.remove(customer);
    }

    public Customer findByCustomerId(int customerId) {
        for (Customer customer : customersList) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        return null;
    }
    public void addAccount(Account account){
        accountsList.add(account);
    }

    public void removeAccount(Account account){
        accountsList.remove(account);
    }

    public Account findAccountByNumber(long accountNo){
        for(Account account : accountsList){
            if(account.getAccount_no() == accountNo){
                return account;
            }
        }
        return null;
    }
}