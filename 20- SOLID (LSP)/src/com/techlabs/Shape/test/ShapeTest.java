package com.techlabs.Shape.test;

import com.techlabs.Shape.model.Circle;
import com.techlabs.Shape.model.IShape;

public class ShapeTest {
public static void main(String[] args) {
	
	IShape s = new Circle(3.3);
	System.out.println(s.getArea());
}
}
