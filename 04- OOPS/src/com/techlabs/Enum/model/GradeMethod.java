package com.techlabs.Enum.model;

public class GradeMethod {

	public static String description(Grade grade) {
		switch (grade) {
		case A:
			return "Excellent";
		case B:
			return "Very Good";
		case C:
			return "Good";
		case D:
			return "Average";
		case E:
			return "Fail";
		case F:
			return "Fail";
		default:
			return "Invalid Grade";
		}
	
	}
}
