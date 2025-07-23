package com.techlabs.model;

public class commerceStudent extends Student{

	int accountsMarks;
	int economicsMarks;
	int businessMarks;
	String grade;
	
	public int getAccMarks() {
		return accountsMarks;
	}
	public int getEcoMarks() {
		return economicsMarks;
	}
	public int getBusinessMarks() {
		return businessMarks;
	}

	public commerceStudent(int rollno, String name, String stream, int accountsMarks, int economicsMarks, int businessmarks) {
		super(rollno, name, stream);
		// TODO Auto-generated constructor stub
		this.accountsMarks= accountsMarks;
		this.economicsMarks= economicsMarks;
		this.businessMarks=businessmarks;
	}
	
	@Override
	public float getAverage() {
		return (accountsMarks+economicsMarks+businessMarks)/3;
	}

	@Override
	public void showMarks() {
		System.out.println("Subject marks: Accounts marks: " +accountsMarks+ " | Economics marks: "+economicsMarks+ " | Business marks: " +businessMarks);
	}

	
	@Override
	public void calculatePerformance() {
		// TODO Auto-generated method stub
		double avg = getAverage();
		if (avg >= 90) 
			grade= "A";
		else if (avg >= 75)
			grade= "B";
		else if (avg >=32)
			grade= "C";
		else
			grade= "D";
		System.out.println("Performance(in avg): " +avg+ "%");
		System.out.println("Grade: " +grade);

	}
}
