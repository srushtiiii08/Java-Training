package com.techlabs.Grade;

public class GradeValidator {

	public boolean isGradeValid(int grade) {
		return grade >= 0 && grade <= 100;
	}

	public String getGradeCategory(int grade) {
		if (grade < 50)
			return "Fail";
		if (grade < 75)
			return "Pass";
		return "Distinction";
	}
}
