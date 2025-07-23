package com.testlabs.test;

public class StringBasic {
public static void main(String[] args) {
//	String str1 = "Amit";
//	String str2 = "Amit";
//	
//	System.out.println(str1 == str2);

//	String str1 = "hello";
//	str1 = str1.concat("worls");
//	
//	System.out.println(str1);
	
	
//	String str3 = new String("Sru");
//	String str4 = new String("Sru");
//	System.out.println(str3 == str4);
	
	String str = "Welcome to Thailand!";
	String strr = " Welcome to Thailand!";

	
	System.out.println(str.charAt(5));
	System.out.println(str.length());
	System.out.println(str.substring(10));
	System.out.println(str.substring(5, 13));
	System.out.println(str.subSequence(2, 6));
	System.out.println(str.endsWith("and!"));
	System.out.println(str.compareTo(strr));
	
}
	

}
