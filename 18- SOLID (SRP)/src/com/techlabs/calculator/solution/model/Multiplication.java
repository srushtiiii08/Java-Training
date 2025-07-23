package com.techlabs.calculator.solution.model;

public class Multiplication {

	public void multiply(Calculator calculator) {
		int result = calculator.getNumber1() * calculator.getNumber2();
		System.out.println("Addition of " +calculator.getNumber1()+ " and " +calculator.getNumber2()+ " :" +result );
	}
}
