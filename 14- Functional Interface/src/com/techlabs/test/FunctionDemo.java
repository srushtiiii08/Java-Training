package com.techlabs.test;

import java.util.function.Function;

public class FunctionDemo {
public static void main(String[] args) {
	
	//ex1
	Function<String, Integer> len = s -> s.length();
	System.out.println(len.apply("helloo"));
	
	
//	Function<Integer, String> fxn = s -> s.par;
//	System.out.println(fxn.apply(6));
	
	
	//ex2
	Function<Double, Double> temperatureConverter = c -> (c * 9/5) + 32;
	System.out.println(temperatureConverter.apply(0.0));
	System.out.println(temperatureConverter.apply(27.0));
	System.out.println(temperatureConverter.apply(34.6));
	
	
	//ex3
	Function<Integer, String> grade = marks -> {
		if (marks>= 75) return "A";
		if (marks >= 50) return "B";
		return "fail";
	};
	
	for (int marks : new int[] {55, 77, 82, 33, 23}) {
		System.out.println(grade.apply(marks));
	}
}
}
