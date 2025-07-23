package com.techlabs.model;

public class CarVC implements IVehicleControl{

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
	public void changeGear(int gear) {
		// TODO Auto-generated method stub
		System.out.println("Car gear changed to " +gear+ " gear");
	}

	@Override
	public String getVehicleType() {
		// TODO Auto-generated method stub
		return "Car";
	}

}
