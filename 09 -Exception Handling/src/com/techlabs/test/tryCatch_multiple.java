package com.techlabs.test;

public class tryCatch_multiple {

	public static void main(String[] args) {
		String[] array = new String[2];
		
		try {
			System.out.println(array[0]);
			System.out.println(array[5]);
		}
		catch (ArrayIndexOutOfBoundsException a){
			System.out.println("Array Index Out Of Bounds Exception");
		}
		catch (NullPointerException n) {
			System.out.println("Null Pointer Exception");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
