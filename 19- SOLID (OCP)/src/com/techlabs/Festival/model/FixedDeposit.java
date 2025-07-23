package com.techlabs.Festival.model;

public class FixedDeposit {
	
	private int accNumber;
	private String name;
	private double principal;
	private int duration;
	private IFestival interest;
	
	public FixedDeposit(int accNumber, String name, double principal, int duration, IFestival interest) {
		this.accNumber = accNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.interest = interest;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public String getName() {
		return name;
	}

	public double getPrincipal() {
		return principal;
	}

	public int getDuration() {
		return duration;
	}

	public IFestival interest() {
		return interest;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setFestivalType(IFestival interest) {
		this.interest = interest;
	}
	
	
	public double calculateSimpleInterest() {
		return (principal*interest.getInterestRates()*duration) / 100;
	}
	

}
