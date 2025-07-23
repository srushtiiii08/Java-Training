package com.techlabs.model;

public interface IVehicleControl {

	void start();
	void stop();
	void changeGear(int gear);
	String getVehicleType();
}
