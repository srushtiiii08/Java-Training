package com.swabhavtechlabs;

public class CheckLeapYear {
	public static void main(String[] args) {
		
		int year = 1800;
		if (year%4==0 && year%100!=0) {
			System.out.println("given year is a leap year");
		}
		else if (year%400==0 && year%100==0 ) {
			System.out.println("given year is a leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}
}
