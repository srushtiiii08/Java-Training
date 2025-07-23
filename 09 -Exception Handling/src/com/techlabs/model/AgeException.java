package com.techlabs.model;

public class AgeException extends Exception{

	public AgeException() {
		System.out.println("under age");
	}
	
	public AgeException(String message) {
		super(message);			//super is used to pass the message provided to default exception handler,
	}							//ie, to pass the message to the parameter mentioned in the constructor
}
