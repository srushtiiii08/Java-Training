package com.techlabs.Example;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(1);
		v1.add(2);
		v1.add("srushti");
		v1.add("patane");
		v1.add(32);

		System.out.println("Vector v1 is " + v1);
		
		
		Vector<Integer> v2 = new Vector<>();
		v2.add(1);
		v2.add(2);
		v2.add(3);
		v2.add(45);
		v2.add(2, 55);
		
		System.out.println("Vector v2 is "+ v2);
	}
}
