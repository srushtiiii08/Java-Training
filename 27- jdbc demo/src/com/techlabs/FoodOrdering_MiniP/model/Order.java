package com.techlabs.FoodOrdering_MiniP.model;

import java.util.List;

public class Order {

	private int orderId;
    private int customerId;
    private List<OrderItem> items;
    private double totalAmount;
    private double discountApplied;
    private double finalAmount;
    private String paymentMode;
    private int deliveryPartnerId;

    public Order() { }

	public int getOrderId() {
		return orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public double getDiscountApplied() {
		return discountApplied;
	}

	public double getFinalAmount() {
		return finalAmount;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public int getDeliveryPartnerId() {
		return deliveryPartnerId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void setDiscountApplied(double discountApplied) {
		this.discountApplied = discountApplied;
	}

	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public void setDeliveryPartnerId(int deliveryPartnerId) {
		this.deliveryPartnerId = deliveryPartnerId;
	}

	public Order(int orderId, int customerId, List<OrderItem> items, double totalAmount, double discountApplied, double finalAmount, String paymentMode, int deliveryPartnerId) {
		this.orderId = orderId;
		this.customerId = customerId;
		this.items = items;
		this.totalAmount = totalAmount;
		this.discountApplied = discountApplied;
		this.finalAmount = finalAmount;
		this.paymentMode = paymentMode;
		this.deliveryPartnerId = deliveryPartnerId;
	}
    
    
}
