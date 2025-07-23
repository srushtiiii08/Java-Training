package com.techlabs.EducationalSoftware.model;

public class ExamSession implements IStudent, ITeacher{
	
	@Override
	public void createQuestionBank() {
		System.out.println("Creating QB before exam");
	}

	@Override
	public void examStart() {
		System.out.println("Exam is started");
	}
	
	@Override
	public void gradeExam() {
		System.out.println("Teacher will grade the paper");
	}

}
