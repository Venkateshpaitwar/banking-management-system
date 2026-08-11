package com.practice.banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Customer> customersList = new ArrayList<>();
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
}