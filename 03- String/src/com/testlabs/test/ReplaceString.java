package com.testlabs.test;

import java.util.Scanner;

public class ReplaceString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	StringBuilder str1 = new StringBuilder("this is good idea");
	str1.replace(8, 12, "bad");
	System.out.println(str1);
}
}
