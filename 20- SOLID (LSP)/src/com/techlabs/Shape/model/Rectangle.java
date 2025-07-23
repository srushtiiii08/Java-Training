package com.techlabs.Shape.model;

public class Rectangle implements IShape{

	int length;
	int breadth;
	


	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}



	@Override
	public double getArea() {
		return length*breadth;
	}

}
