package com.techlabs.Enum.test;

import java.util.Scanner;

import com.techlabs.Enum.model.TicketBookingMethodMiniP;
import com.techlabs.Enum.model.TicketTypeMiniP;

public class TicketBookingMiniP {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your name: ");
	String name = sc.nextLine();
	
	System.out.println("Select ticket type: \n\t REGULAR, VIP, PREMIUM");
	String input = sc.next().toUpperCase();
	TicketTypeMiniP type = TicketTypeMiniP.valueOf(input);
	
	TicketBookingMethodMiniP ticket = new TicketBookingMethodMiniP(name, type);
	System.out.println("What do you want to with the ticket? \n\t (CONFIRM/CANCEL) ");
	String action = sc.next().toUpperCase();
	
	if (action.equals("CONFIRM")) {
		ticket.confirmBooking();
	} else if (action.equals("CANCEL")) {
		ticket.cancelBooking();
	} else {
		System.out.println("Invalid input");
	}
	
	System.out.println("\n   Ticket Details: ");
	ticket.displayTicket();
}
}
