package com.techlabs.model;

public class BikeVC implements IVehicleControl{

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
	public void changeGear(int gear) {
		// TODO Auto-generated method stub
		System.out.println("Bike gear changed to " +gear+ " gear");
	}

	@Override
	public String getVehicleType() {
		// TODO Auto-generated method stub
		return "Bike";
	}

}
