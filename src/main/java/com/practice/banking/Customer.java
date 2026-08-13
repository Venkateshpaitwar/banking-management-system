package com.practice.banking;
import java.util.Objects;


public class Customer {
    private int customerId;
    private String name;
    private String email;

    public Customer(int customerId, String name, String email){
        this.customerId = customerId;
        this.name =  name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

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

    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }

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
