package com.techlabs.model;

public class Light implements IControllable{

	@Override
	public void turnOn() {
		System.out.println("Light turned on");
	}

	@Override
	public void turnOff() {
		System.out.println("Light turned off");
	}

	@Override
	public void setMode(String mode) {
		if (mode.equalsIgnoreCase("Dim" ) || mode.equalsIgnoreCase("Bright")) {
			System.out.println("Light mode set to: " +mode);
		}else {
		System.out.println("Invalid light mode! Valid options are: Dim, Bright");
		System.out.println("Light mode set to: Dim(default) ");
		}
	}
}
