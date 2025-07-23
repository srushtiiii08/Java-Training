package com.techlabs.Shape.model;

public class Square implements IShape{

	int side;



	public Square(int side) {
		this.side = side;
	}



	@Override
	public double getArea() {
		return side*side;
	}
	
	
}
