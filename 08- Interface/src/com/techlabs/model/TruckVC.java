package com.techlabs.model;

public class TruckVC implements IVehicleControl{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Truck started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Truck stopped");
	}

	@Override
	public void changeGear(int gear) {
		// TODO Auto-generated method stub
		System.out.println("Truck gear changed to " +gear+ " gear");
	}

	@Override
	public String getVehicleType() {
		// TODO Auto-generated method stub
		return "Truck";
	}

}
