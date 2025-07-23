package com.techlabs.PatientRecords.model;

public class EmailNotification {
	
		public void email(String recipientEmail, String subject, String message) {
	        System.out.println("Sending email to: " + recipientEmail);
	        System.out.println("Subject: " + subject);
	        System.out.println("Message:\n" + message);
	    }

}
