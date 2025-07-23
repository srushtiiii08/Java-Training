package com.techlabs.controllable;

public class Speaker implements IControllable{

	@Override
	public void turnOn() {
		System.out.println("Speaker turned on");
	}

	@Override
	public void turnOff() {
		System.out.println("Speaker turned off");
	}

	@Override
	public void setMode(String mode) {
		if (mode.equalsIgnoreCase("Bass" ) || mode.equalsIgnoreCase("Low pitch")) {
			System.out.println("Light mode set to: " +mode);
		}else {
		System.out.println("Invalid light mode! Valid options are: Bass, Low pitch");
		System.out.println("Light mode set to: Bass(default) ");
		}	}

}
