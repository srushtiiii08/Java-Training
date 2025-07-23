package com.techlabs.model;

//concrete -- refined abstraction
public class Circle extends Shape{

	public Circle(Colour colour) {
		super(colour);
	}

	public void draw() {
		System.out.println("\nCircle filled with colour ");
		colour.applyColour();
	}
}
