package com.techlabs.model;

public interface IExamEvaluator {

	void evaluateMarks(double marks);
    void calculateGrade();
    String getExamType();
}
