package com.techlabs.Enum.model;

public enum TicketTypeMiniP {
REGULAR, VIP, PREMIUM;
	
	public int getPrice(TicketTypeMiniP tic) {
		switch(tic) {
		case REGULAR:
			return 100;
		case VIP: 
			return 200;
		case PREMIUM:
			return 300;
		default: 
//			System.out.println("Invalid input");
			return 0;
		}
	}
}
