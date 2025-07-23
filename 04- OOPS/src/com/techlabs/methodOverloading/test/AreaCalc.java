package com.techlabs.methodOverloading.test;

public class AreaCalc {
	
	public int area(int side) {
		return side*side;
	}
	
	public int area(int length, int breadth) {
		return length*breadth;
	}
	
	public double area(double rad) {
		return 3.14*rad*rad;
	}
	
	
	public static void main(String[] args) {
		AreaCalc ac = new AreaCalc();
		
		System.out.println("Area of a square: " +ac.area(4));
		System.out.println("Area of rectangle: " + ac.area(12, 13));
		System.out.println("Area of circle: " + ac.area(4.5));
	}

}
