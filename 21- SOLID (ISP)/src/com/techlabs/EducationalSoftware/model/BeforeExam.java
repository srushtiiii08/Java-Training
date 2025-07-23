package com.techlabs.EducationalSoftware.model;

public class BeforeExam implements IAdmin{

	@Override
	public void assignTeacher() {
		System.out.println("exam cell is assigning invigilator");
	}

}
