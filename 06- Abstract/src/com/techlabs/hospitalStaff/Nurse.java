package com.techlabs.hospitalStaff;

public class Nurse extends HospitalStaff{

	String shiftTimings;
	
	public Nurse(int staffID, String name, String department, String shiftTimings) {
		super(staffID, name, department);
		// TODO Auto-generated constructor stub
		this.shiftTimings= shiftTimings;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(name+ " is assisting in " +department+ " during " +shiftTimings+ " shift.");
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Shift: " +shiftTimings;
	}

}
