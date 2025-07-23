package com.techlabs.model;

public class ThreeSubjMarks {
	String name;
	int PRN;
	int mathsMarks;
	int engMarks;
	int sciMarks;
	
	//constructor
	public ThreeSubjMarks(String name, int PRN, int mathsMarks, int engMarks, int sciMarks) {
		this.name = name;
		this.PRN = PRN;
		this.mathsMarks = mathsMarks;
		this.engMarks=engMarks;
		this.sciMarks=sciMarks;
	}
	
	public void display() {
		System.out.println("Name: " +name+ " || Roll no: " +PRN+ " || Maths marks: " +mathsMarks+ " || English Marks: " + engMarks + " || Science Marks: " +sciMarks);
		System.out.println("___________________________________________________________________________________________________");
	}

}
