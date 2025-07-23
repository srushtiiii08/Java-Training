package com.techlabs.model;

public class Plugin {

	private double version;

	private Plugin(double version) {
		this.version = version;
	}
	
	public Plugin() {
	}

	public void execute() {
		System.out.println("Plugging executed");
	}
	
}
