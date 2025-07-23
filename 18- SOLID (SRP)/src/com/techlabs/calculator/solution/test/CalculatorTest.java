package com.techlabs.calculator.solution.test;

import com.techlabs.calculator.solution.model.Addition;
import com.techlabs.calculator.solution.model.Calculator;
import com.techlabs.calculator.solution.model.Division;
import com.techlabs.calculator.solution.model.Multiplication;
import com.techlabs.calculator.solution.model.Subtraction;

public class CalculatorTest {
public static void main(String[] args) {
	
	Calculator calculator = new Calculator(8, 14);
	
	Addition addition = new Addition();
	addition.add(calculator);
	
	Subtraction subtraction = new Subtraction();
	subtraction.sub(calculator);
	
	Division division = new Division();
	division.div(calculator);
	
	Multiplication multi = new Multiplication();
	multi.multiply(calculator);
}
}
