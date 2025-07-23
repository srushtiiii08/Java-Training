package com.techlabs.abstractt.model;

public abstract class Shape {

	String name;
	
	public String getName() {
		return name;
	}


	public Shape(String name) {
		this.name=name;
	}
	
	public abstract String draw();
}
