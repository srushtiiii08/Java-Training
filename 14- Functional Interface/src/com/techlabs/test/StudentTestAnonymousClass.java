package com.techlabs.test;

import com.techlabs.model.ISciStudent;
import com.techlabs.model.IStudent;

public class StudentTestAnonymousClass {
public static void main(String[] args) {
	
	IStudent student = new IStudent() {  	//object of interface created
											//this method can be used for normal interface as well
		@Override
		public void greet() {
			System.out.println("anonymous class implemented");
		}
	};
	student.greet();
	
	System.out.println("-------------------------------------");
	
	ISciStudent sci = new ISciStudent() {
		
		@Override
		public void show() {
			System.out.println("2nd Functional interface implemented");
		}
	};
	sci.show();
}
}
