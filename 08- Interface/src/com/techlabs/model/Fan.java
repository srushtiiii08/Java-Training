package com.techlabs.model;

public class Fan implements IControllable{

	@Override
	public void turnOn() {
		System.out.println("Fan turned on");
	}

	@Override
	public void turnOff() {
		System.out.println("Fan turned off");

	}

	@Override
	public void setMode(String mode) {
		if (mode.equalsIgnoreCase("high" ) || mode.equalsIgnoreCase("low")) {
			System.out.println("Light mode set to: " +mode);
		}else {
		System.out.println("Invalid light mode! Valid options are: High, Low");
		System.out.println("Light mode set to: high(default) ");
		}

	}

}
