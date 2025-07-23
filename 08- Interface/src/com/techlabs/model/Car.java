package com.techlabs.model;

public class Car implements IVehicle{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car stopped");
	}

	@Override
	public String fuelType() {
		// TODO Auto-generated method stub
		return "Diesel/Petrol";
	}

}
