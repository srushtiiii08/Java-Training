package com.testlabs.test;

import java.util.Scanner;

public class GradeCalculator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter student's marks: ");
	int marks = sc.nextInt();
	
	if (marks>= 90) {
		System.out.println("Grade: A");
	}
	else if (marks>= 75 && marks <=89 ) {
		System.out.println("Grade: B");
	}
	else if (marks>=60 && marks <=74) {
		System.out.println("Grade: C");
	}
	else if (marks<60) {
		System.out.println("Grade: D");
	}
}
}
