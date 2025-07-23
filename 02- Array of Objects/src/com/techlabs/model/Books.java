package com.techlabs.model;

public class Books {
	String bookName;
	int bookID;
	
	public Books(String bookName, int bookID) {
		this.bookName = bookName;
		this.bookID = bookID;
	}
	
	public void display() {
		System.out.println("Book Title: " +bookName);
		System.out.println("---------------------------");
	}
	public void displayID() {
		System.out.println("Book ID: " +bookID);
		System.out.println("---------------------------");
	}

}
