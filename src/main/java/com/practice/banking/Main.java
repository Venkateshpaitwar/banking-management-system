package com.practice.banking;

public class Main {

    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Venkatesh", "vp@gmail.com");
        Customer c2 = new Customer(2, "Srushti", "sa@gmail.com");
        System.out.println(c1.getCustomerId());
        System.out.println(c1.getName());
        System.out.println(c1.getEmail());

        System.out.println(c2.getCustomerId());
        System.out.println(c2.getName());
        System.out.println(c2.getEmail());
    }
}
