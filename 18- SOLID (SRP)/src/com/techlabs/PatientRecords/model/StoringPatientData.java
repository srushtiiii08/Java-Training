package com.techlabs.PatientRecords.model;

public class StoringPatientData {
	
	public String format(PatientRecords records) {
        return String.format("Patient Record:\nName: %s\nAge: %d\nDiagnosis: %s", records.getName(), records.getAge(),records.getAssignedDr());
    }
}
