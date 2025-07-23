package com.techlabs.abstractt.model;
import com.techlabs.abstractt.model.Student;

public class CommerceStudent extends Student{

	int accMarks;
	int ecoMarks;
	int businessMarks;
	
	public int getAccMarks() {
		return accMarks;
	}
	public int getEcoMarks() {
		return ecoMarks;
	}
	public int getBusinessMarks() {
		return businessMarks;
	}

	public CommerceStudent(int rollno, String name, int accMarks, int ecoMarks, int businessmarks) {
		super(rollno, name);
		// TODO Auto-generated constructor stub
		this.accMarks= accMarks;
		this.ecoMarks= ecoMarks;
		this.businessMarks=businessmarks;
	}
	

	public double getAverage() {
		return (accMarks+ecoMarks+businessMarks)/3.0;
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
