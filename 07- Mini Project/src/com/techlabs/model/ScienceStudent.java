package com.techlabs.model;

public class ScienceStudent extends Student{

	int physicsMarks;
	int chemistryMarks;
	int mathMarks;
	String grade;
	
	public int getPhyMarks() {
		return physicsMarks;
	}


	public int getChemMarks() {
		return chemistryMarks;
	}


	public int getMathMarks() {
		return mathMarks;
	}
	
	public ScienceStudent(int rollNumber, String name, String stream, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(rollNumber, name, stream);
		this.physicsMarks=physicsMarks;
		this.chemistryMarks=chemistryMarks;
		this.mathMarks= mathMarks;
	}
	
	@Override
	public float getAverage() {
		return (physicsMarks+chemistryMarks+mathMarks)/3;
	}
	
	@Override
	public void showMarks() {
		System.out.println("Subject marks: Physics marks: " +physicsMarks+ " | Chemistry marks: "+chemistryMarks+ " | Math marks: " +mathMarks);
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
