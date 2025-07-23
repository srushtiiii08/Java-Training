package com.techlabs.methodOverloading.test;

public class VolCalc {
	public int volume(int side) {
		return side*side*side;
	}
	
	public int  volume(int l, int b, int h) {
		return l*b*h;
	}
	
	public double volume(double rad) {
		return (1.33*3.14*rad*rad*rad);
	}
	
	
	public static void main(String[] args) {
		VolCalc vc = new VolCalc();
		
		System.out.println("Volume of cube: " + vc.volume(4));
		System.out.println("Volume of cuboid: " + vc.volume(2, 4, 3));
		System.out.println("Volume of sphere: " + vc.volume(3.3));
	}

}
