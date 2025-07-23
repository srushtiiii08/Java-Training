package com.techlabs.model;


//concrete -- refined abstraction
public class Triangle extends Shape{

	public Triangle(Colour colour) {
		super(colour);
	}

	public void draw() {
		System.out.println("\nTriangle filled with colour ");
		colour.applyColour();
	}
}
