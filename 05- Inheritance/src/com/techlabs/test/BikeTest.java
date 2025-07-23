package com.techlabs.test;

import com.techlabs.model.Bike;
import com.techlabs.model.Car;

public class BikeTest {
public static void main(String[] args) {
	Car car = new Car();
	Bike bike = new Bike();
	
	car.start();
	car.features();
	
	System.out.println("\n");
	
	bike.start();
	bike.features();
}
}
