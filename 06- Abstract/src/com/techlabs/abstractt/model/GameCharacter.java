package com.techlabs.abstractt.model;

public abstract class GameCharacter {

	String name;
	int powerLevel;
	
	public String getName() {
		return name;
	}

	public int getPowerLevel() {
		return powerLevel;
	}
	
	public GameCharacter(String name, int powerLevel) {
		this.name=name;
		this.powerLevel=powerLevel;
	}
	
	public abstract void attack();
	
	public void showStatus() {
		System.out.println("Name: "+getName() + "\nPower Level --> " + powerLevel );
	}
}
