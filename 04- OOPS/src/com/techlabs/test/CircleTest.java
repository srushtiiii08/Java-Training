package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Circle;

public class CircleTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the radius of a circle: ");
	double rad= sc.nextDouble();
	
	sc.nextLine();
	
	Circle circle = new Circle(rad);
	
	System.out.println("The area of a circle is: ");
	System.out.println(circle.CalculateArea());
}
}
