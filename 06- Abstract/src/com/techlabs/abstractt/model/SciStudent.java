package com.techlabs.abstractt.model;
import com.techlabs.abstractt.model.Student;

public class SciStudent extends Student{
	
	int phyMarks;
	int chemMarks;
	int mathMarks;
	
	
	public int getPhyMarks() {
		return phyMarks;
	}


	public int getChemMarks() {
		return chemMarks;
	}


	public int getMathMarks() {
		return mathMarks;
	}


//	public void setPhyMarks(int phyMarks) {
//		this.phyMarks = phyMarks;
//	}
//
//
//	public void setChemMarks(int chemMarks) {
//		this.chemMarks = chemMarks;
//	}
//
//
//	public void setMathMarks(int mathMarks) {
//		this.mathMarks = mathMarks;
//	}


	public SciStudent(int rollno, String name, int phyMarks, int chemMarks, int mathMarks) {
		super(rollno, name);
		// TODO Auto-generated constructor stub
		this.phyMarks= phyMarks;
		this.chemMarks= chemMarks;
		this.mathMarks= mathMarks;
	}
	
	public double getAverage() {
		return (phyMarks+chemMarks+mathMarks)/3.0;
	}


	@Override
	public String calcGrade() {
		// TODO Auto-generated method stub
		double avg = getAverage();
		if (avg >= 90) 
			return "A";
		else if (avg >= 75)
			return "B";
		else if (avg >=32)
			return "C";
		else
			return "D";
	}
}
