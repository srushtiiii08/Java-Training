package com.techlabs.FoodOrdering_MiniP.model;

public class Discount {

	private double threshold;
    private double flatDiscount;

    public Discount(double threshold, double flatDiscount) {
        this.threshold = threshold;
        this.flatDiscount = flatDiscount;
    }

	public double getThreshold() {
		return threshold;
	}

	public double getFlatDiscount() {
		return flatDiscount;
	}

	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}

	public void setFlatDiscount(double flatDiscount) {
		this.flatDiscount = flatDiscount;
	}
    
}
