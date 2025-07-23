package com.techlabs.methodOverloading.test;

public class TempConverter {
	public double Convert(double cel) {
		return (cel*1.8)+32;
	}
	
	public double Convert(double value, String scale) {
		if (scale.equalsIgnoreCase("c")) {
			return (value*1.8)+32;
		}
		if (scale.equalsIgnoreCase("f")) {
			return (value-32)*0.55;
		}
		return 0.0;
	}
	
	public static void main(String[] args) {
		TempConverter tc = new TempConverter();
		
		System.out.println(tc.Convert(22.2));
		System.out.println(tc.Convert(22, "c"));
		System.out.println(tc.Convert(87, "f"));
	}

}
 