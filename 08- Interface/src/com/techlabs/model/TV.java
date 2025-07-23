package com.techlabs.model;

public class TV implements IControllable{

	@Override
	public void turnOn() {
		System.out.println("TV turned on");

	}

	@Override
	public void turnOff() {
		System.out.println("TV turned off");
	}

	@Override
	public void setMode(String mode) {
		if (mode.equalsIgnoreCase("HD" ) || mode.equalsIgnoreCase("SD")) {
			System.out.println("Light mode set to: " +mode);
		}else {
		System.out.println("Invalid light mode! Valid options are: HD, SD");
		System.out.println("Light mode set to: HD(default) ");
		}
	}

}
