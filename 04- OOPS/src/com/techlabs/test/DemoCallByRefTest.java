package com.techlabs.test;

import com.techlabs.model.DemoCallByRef;

public class DemoCallByRefTest {
	public static void changeName(DemoCallByRef s) {          //"DemoCallByRef s" is an object created
		s.name = "Anjali";
		s = new DemoCallByRef();			//new obj created
		s.name = "Riya";
	}
	
	public static void main(String[] args) {
		DemoCallByRef s1 = new DemoCallByRef();
		s1.name = "sru";
		
		changeName(s1);   //method passes object 's1' as args   & the original obj is changed
		System.out.println("name: " + s1.name);
	}

}
