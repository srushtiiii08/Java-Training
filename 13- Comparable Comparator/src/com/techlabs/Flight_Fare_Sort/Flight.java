package com.techlabs.Flight_Fare_Sort;

public class Flight {
	
	String airline;
	double fare;
	
	public Flight(String airline, double fare) {
		super();
		this.airline = airline;
		this.fare = fare;
	}

	@Override
	public String toString() {
		return airline + ": " + fare;
	}
}
