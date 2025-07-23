package com.techlabs.model;

public class BonusValidator {
	private String name;
	private double sal;
	private double bonus;
	
	public void setDetails(String name, double sal) {
		this.name = name;
		this.sal = sal;
		this.bonus=0;
	}
	
	public void setBonus(double bonus) {
		if (bonus <= 0.2*sal) {
			this.bonus = bonus;
		}
		else {
			System.out.println("Bonus exceeds 20% of salary");
		}
	}
	public void displaySal() {
		System.out.println("Basic salary: " + sal);
		System.out.println("Bonus: " + bonus);
		System.out.println("Final salary: " + (sal+bonus));
	}

}
