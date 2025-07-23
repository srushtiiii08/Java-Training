package com.techlabs.model;

public class PracticalExam implements IExamEvaluator{

	double marks;
	String grade;

	public void evaluateMarks(double marks) {
		this.marks = marks;
	}

	public void calculateGrade() {
		if (marks >= 80)
			grade = "A";
		else if (marks >= 60)
			grade = "B";
		else if (marks >= 40)
			grade = "C";
		else
			grade = "F";

		System.out.println("Practical Exam Grade: " + grade);
	}

	public String getExamType() {
		return "Practical Exam";
	}
	
}
