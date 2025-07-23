package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.BonusValidator;

public class BonusValidatorTest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	BonusValidator emp = new BonusValidator();
	
	System.out.println("Enter employee name: ");
	String name= sc.nextLine();
	
	System.out.println("Enter salary: ");
	double sal = sc.nextDouble();
	
	emp.setDetails(name, sal);
	
	System.out.println("Enter bonus: ");
	double bonus = sc.nextDouble();
	emp.setBonus(bonus);
	
	emp.displaySal();
}
}
