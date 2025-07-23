package com.techlabs.abstractt.test;
import com.techlabs.abstractt.model.Circle;
import com.techlabs.abstractt.model.Shape;
import com.techlabs.abstractt.model.Square;
import com.techlabs.abstractt.model.Triangle;

public class ShapeTest {
public static void main(String[] args) {
	
	Shape[] s = new Shape[3];
	s[0] = new Circle("Circle");
	s[1] = new Square("Square");
	s[2] = new Triangle("Triangle");
	
	for (Shape res: s) {
		System.out.println("For " +res.getName() + ", " +res.draw());
	}
}
}
