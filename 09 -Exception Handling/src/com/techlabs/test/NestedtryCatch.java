package com.techlabs.test;

public class NestedtryCatch {
public static void main(String[] args) {
	int[] array = new int[2];
	array[1] = 10;
//	array[4] = 2;
	
	try {
		array[1]/=0;
		try {
			System.out.println(array[5]);
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Inner block " +a);
		}
	} catch(ArithmeticException a) {
		System.out.println("Outer bloc " +a);
	}
}
}
