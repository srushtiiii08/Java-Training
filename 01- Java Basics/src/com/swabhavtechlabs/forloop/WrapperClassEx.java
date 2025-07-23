package com.swabhavtechlabs.forloop;

public class WrapperClassEx {
public static void main(String[] args) {
	int number1 = 10;
	Integer number2 = new Integer(number1);       //boxing
	
	Integer number3 = number1;       		   //Autoboxing
	
	System.out.println("number1 is: " + number1);
	System.out.println("number2 is: " + number2);
	System.out.println("number3 is: " + number3);
	
	int number4 = number2.intValue();       //unboxing
	int number5 = number2;                 //Auto unboxing
	
	System.out.println("number4 is: " + number4);
	System.out.println("number5 is: " + number5);
	
//	Integer number6 = 10;
//	System.out.println("number6 is: " + number6);
	
}
}
