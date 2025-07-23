package com.techlabs.test;

import com.techlabs.model.Bike;
import com.techlabs.model.Car;
import com.techlabs.model.IVehicle;

public class VehicleTest {
public static void main(String[] args) {
	
	IVehicle[] vehicle = new IVehicle[2];
	vehicle[0] = new Car();
	vehicle[1] = new Bike();
	
	for (IVehicle result: vehicle) {
		result.start();
		System.out.println("Fuel Type: " +result.fuelType());
		
		result.stop();
		System.out.println("--------------------------------");
	}
}
}
