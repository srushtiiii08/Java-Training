package com.techlabs.test;

import java.util.Scanner;

public class throwKeyword {

	static void validateMarks(int marks) {
		if (marks < 0 || marks > 100) {
			throw new IllegalArgumentException("marks are not valid");
		}
		System.out.println("Valid marks");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks = sc.nextInt();

		validateMarks(marks);
	}
}
