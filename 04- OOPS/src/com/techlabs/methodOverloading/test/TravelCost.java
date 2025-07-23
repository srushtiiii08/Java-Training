package com.techlabs.methodOverloading.test;

public class TravelCost {
	
	int baseRate = 10;
	public void estimate(int dist) {
		int total = baseRate*dist;
		System.out.println("Total rate for " +dist+ "km is " + total+ "rs.");
	}
	
	public void estimate(int dist, int passengers) {
		int total = baseRate*dist;
		if (passengers > 1) {
			total *= passengers;
		}
		System.out.println("Total cost: " + total);
	}
	
	public void estimate(int dist, int passengers, boolean AC) {
		int total = baseRate*dist;
		if (passengers > 1) {
			total *= passengers;
		}
		if (AC) {
			total += total*0.2;
		}
		System.out.println("Total cost: " + total);
	}
	
	public static void main(String[] args) {
		TravelCost tc = new TravelCost();
		
		tc.estimate(5);
		tc.estimate(5, 2);
		tc.estimate(5, 2, false);
		tc.estimate(5, 0, true);
	}
}
