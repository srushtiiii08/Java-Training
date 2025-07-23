package com.techlabs.methodOverloading.test;

public class StudentEval {

	public void evaluate(int marks) {
		if (marks>=90) {
			System.out.println("Excellent");
		}
		else {
			System.out.println("can do better");
		}
	}
	
	public void evaluate(int marks, int totalmarks) {
		double percent = (marks*100.0)/totalmarks;
		System.out.println("Percentage scored is " +percent+ "%");
		if (percent>=90) {
			System.out.println("Grade: A");
		}
		else if (percent>=75) {
			System.out.println("Grade: B");
		}
		else {
			System.out.println("Grade: C");
		}
	}
	
	public void evaluate(String grade) {
		if (grade.equalsIgnoreCase("a")) {
			System.out.println("very Good");
		}
		else if (grade.equalsIgnoreCase("b")) {
			System.out.println("good");
		}
		else {
			System.out.println("Needs improvement");
		}
	}
	
	
	public static void main(String[] args) {
		StudentEval se = new StudentEval();
		
		se.evaluate(92);
		se.evaluate(65, 100);
		se.evaluate("c");
	}
}
