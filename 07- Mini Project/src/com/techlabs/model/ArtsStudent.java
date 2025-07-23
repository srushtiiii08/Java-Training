package com.techlabs.model;

public class ArtsStudent extends Student{

	int historyMarks;
	int polScienceMarks;
	int sociologyMarks;
	String grade;
	
	
	public int getHistoryMarks() {
		return historyMarks;
	}

	public int getPolScienceMarks() {
		return polScienceMarks;
	}

	public int getSociologyMarks() {
		return sociologyMarks;
	}
	
	public ArtsStudent(int rollNumber, String name, String stream, int historyMarks, int polScienceMarks, int sociologyMarks) {
		super(rollNumber, name, stream);
		this.historyMarks=historyMarks;
		this.polScienceMarks=polScienceMarks;
		this.sociologyMarks=sociologyMarks;
	}
	
	@Override
	public float getAverage() {
		return (historyMarks+polScienceMarks+sociologyMarks)/3;
	}

	@Override
	public void showMarks() {
		System.out.println("Subject marks: History marks: " +historyMarks+ " | Political Science marks: "+polScienceMarks+ " | Sociology marks: " +sociologyMarks);
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
