package com.testlabs.test;

public class StringBuilderEx {
public static void main(String[] args) {
	StringBuilder str1 = new StringBuilder("Hello");
	StringBuilder str2 = new StringBuilder("Hello");
	
	System.out.println(str1 == str2);
	System.out.println(str1.equals(str2));
	System.out.println(str1.append("world"));
}
}
