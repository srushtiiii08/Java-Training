package com.techlabs.test;

import com.techlabs.model.ISciStudent;
import com.techlabs.model.IStudent;

public class StudentTestLambdaExpression {
public static void main(String[] args) {
	
	
	//for 0 or 1+ parameters, () is needed
	IStudent student = () -> System.out.println("Hello");   //lambda
	student.greet();									//calling the method
	
	
	//for 1 parameter arrow is not needed
//	IStudent student = msg -> msg;   //msg before the arrow is the data type wala and after the arrow is return wala
//	System.out.println(student.display("helloo"));
	
	
	//2nd FI method called--this is how multiple FI methods can be called
	ISciStudent sci = () -> System.out.println("Science student");
	sci.show();
}
}
