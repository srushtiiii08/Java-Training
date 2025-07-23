package com.techlabs.Enum.model;

public class TicketBookingMethodMiniP {
	String cusName;
	TicketTypeMiniP tikType;
	BookingStatusMiniP status;
	
	public TicketBookingMethodMiniP(String cusName, TicketTypeMiniP tikType) {
		this.cusName= cusName;
		this.tikType=tikType;
		this.status = BookingStatusMiniP.PENDING;
	}
	
	public int calcPrice() {
		return tikType.getPrice(tikType);
	}
	
	public void confirmBooking() {
		this.status=BookingStatusMiniP.CONFIRMED;
	}
	
	public void cancelBooking() {
		this.status=BookingStatusMiniP.CANCELLED;
	}
	
	public void displayTicket() {
		System.out.println("Customer Name: " + cusName);
		System.out.println("Ticket Type: " + tikType);
		System.out.println("Price: " + calcPrice());
		System.out.println("Status: " + status);
	}
	
}
