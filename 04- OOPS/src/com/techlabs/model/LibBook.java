package com.techlabs.model;

public class LibBook {
	private String title;
	private String author;
	private boolean issued;
	
	public LibBook(String title, String author) {
		this.title=title;
		this.author=author;
		this.issued= false;			//book is available by default
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setIssue(boolean issued) {
		this.issued=issued;
	}
	
	public String getStatus() {
		if (issued = true) {
			return "book issued";
		}
		else {
			return "book availabel";
		}
	}
	
	public void display() {
		System.out.println("______________________");
		System.out.println("Book title: " + title);
		System.out.println("Author name: " + author);
		System.out.println("Book status: " + getStatus());
		System.out.println("______________________");
	}
}
