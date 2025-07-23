package com.testlabs.test;

public class SBReverseCheck {
public static void main(String[] args) {
	String str1 = "hell";
	String str2 = "lleh";
	
	StringBuilder sb = new StringBuilder(str2);
	
	if (str1.equals(sb.reverse().toString())) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
}
}
