package com.testlabs.test;

public class SBReplaceSpace {
public static void main(String[] args) {
	String str1 = "Hello world";
	StringBuilder sb = new StringBuilder();
	
	for (char c : str1.toCharArray() ) {
		if (c!=' ') {
			sb.append(c);			//if char is not a space then add the char to sb in array form
		}
	}
	System.out.println("Output: " + sb.toString());			//print all values of sb that does not have space, converts arr to string
}
}
