package com.techlabs.FoodOrdering_MiniP.model;

public class Customer {

	private int customerId;
    private String name;
    private String contact;

    public Customer() { }

    public Customer(int customerId, String name, String contact) {
        this.customerId = customerId;
        this.name = name;
        this.contact = contact;
    }

	public int getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public String getContact() {
		return contact;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
    
    
}
