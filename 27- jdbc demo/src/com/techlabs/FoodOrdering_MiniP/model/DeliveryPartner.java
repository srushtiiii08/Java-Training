package com.techlabs.FoodOrdering_MiniP.model;

public class DeliveryPartner {

	private int partnerId;
    private String name;
    private String contact;

    public DeliveryPartner() { }

    public DeliveryPartner(int partnerId, String name, String contact) {
        this.partnerId = partnerId;
        this.name = name;
        this.contact = contact;
    }

	public int getPartnerId() {
		return partnerId;
	}

	public String getName() {
		return name;
	}

	public String getContact() {
		return contact;
	}

	public void setPartnerId(int partnerId) {
		this.partnerId = partnerId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	
    
}
