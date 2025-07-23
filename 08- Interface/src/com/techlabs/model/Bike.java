package com.techlabs.model;

public class Bike implements IVehicle{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Bike started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Bike stopped");
	}

	@Override
	public String fuelType() {
		// TODO Auto-generated method stub
		return "Petrol";
	}

}
