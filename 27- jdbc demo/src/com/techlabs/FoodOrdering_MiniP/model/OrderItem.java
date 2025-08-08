package com.techlabs.FoodOrdering_MiniP.model;

public class OrderItem {

	private int orderItemId;
    private int orderId;
    private MenuItem item;
    private int quantity;
    private double subtotal;

    public OrderItem() { }
    
    public OrderItem(int orderItemId, int orderId, MenuItem item, int quantity, double subtotal) {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.item = item;
        this.quantity = quantity;
        this.subtotal = subtotal;
    }

	public int getOrderItemId() {
		return orderItemId;
	}

	public int getOrderId() {
		return orderId;
	}

	public MenuItem getItem() {
		return item;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setItem(MenuItem item) {
		this.item = item;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
    
    
}
