package com.techlabs.calculator.solution.model;

public class Subtraction {
	
	public void sub(Calculator calculator) {
		int result = calculator.getNumber1() - calculator.getNumber2();
		System.out.println("Subtraction of " +calculator.getNumber1()+ " and " +calculator.getNumber2()+ " :" +result );
	}

}
