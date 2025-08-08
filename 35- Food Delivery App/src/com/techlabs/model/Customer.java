package com.techlabs.model;


public class Customer {
    private int customerId;
    private String name;
    private String contact;

    public Customer(int customerId, String name, String contact) {
        this.customerId = customerId;
        this.name = name;
        this.contact = contact;
    }

    public int getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getContact() { return contact; }
}