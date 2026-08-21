package com.practice.banking;
import java.util.Objects;

/*
 * Concepts:
 * - Encapsulation
 * - Constructor
 * - Object class methods
 * - Method overriding
 * - Equality contract
 */

public class Customer {

    // Encapsulation: private instance variables
    private int customerId;
    private String name;
    private String email;


    // Constructor: initializes object state
    // this refers to the current object
    public Customer(int customerId, String name, String email){
        this.customerId = customerId;
        this.name =  name;
        this.email = email;
    }

    /*
     * Method overriding:
     * Overrides Object.toString().
     *
     * Used for meaningful string representation of the object.
     */
    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /*
     * Method overriding:
     * Overrides Object.equals().
     *
     * Logical equality:
     * Customers are considered equal based on customerId.
     *
     * this == obj:
     * Reference equality / same object check.
     *
     * instanceof:
     * Runtime type check.
     *
     * Type casting:
     * Object -> Customer.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) obj;
        return this.customerId == other.customerId;
    }

    /*
     * Method overriding:
     * Overrides Object.hashCode().
     *
     * Hashing:
     * Generates hash based on the same field used by equals().
     *
     * equals-hashCode contract:
     * If two objects are equal, their hash codes must be equal.
     */
    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }


    // Encapsulation: controlled read access through getters
    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
