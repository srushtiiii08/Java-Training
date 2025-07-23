package com.techlabs.hospitalStaff;

public class Doctor extends HospitalStaff{

	
	String specialization;
	String[] patients;
	
	public Doctor(int staffID, String name, String department, String specialization, String[] patients) {
		super(staffID, name, department);
		this.specialization=specialization;
		this.patients=patients;
	}
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(name+ " is treating patients as" +specialization);
	}
	
	public String toString() {			//toSTring return str representation of obj(can be class name also)
		String patientList ="";
		for (int i=0; i<patients.length; i++) {
			patientList += patients[i];
			if (i<patients.length - 1) {			//so as long as patient len is less than 1, add comma
				patientList = ", ";      			// such that arya, nila, jheela,  --> not valid BUT  
			}										//arya, nila, jheela --> is valid cz no comma after the last input
		}
		return super.toString() + ", Specialization: " +specialization+ ", Patients: " + patientList;
	}
}
