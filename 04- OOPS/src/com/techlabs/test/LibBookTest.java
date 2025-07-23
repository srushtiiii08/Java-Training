package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.LibBook;

public class LibBookTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//book1
	System.out.println("Enter title of book1: ");
	String title1 = sc.nextLine();
	
	System.out.println("Enter author of book1: ");
	String author1 = sc.nextLine();
	LibBook book1 = new LibBook(title1, author1);
	
	//book2
	System.out.println("Enter title of book2: ");
	String title2 = sc.nextLine();
	
	System.out.println("Enter author of book2: ");
	String author2 = sc.nextLine();
	LibBook book2 = new LibBook(title1, author1);
	
	System.out.println("\n   Current status: ");
	book1.display();
	book2.display();
	
	//issue book1
	System.out.println("\nDo you want to issue book 1? (Y/N)");
	String issue1 = sc.nextLine();
	if (issue1.equalsIgnoreCase("y")) {
		book1.setIssue(true);
	}
	
	//return another book2
	System.out.println("\nDo you want to return book2? (Y/N)");
	String return2 = sc.nextLine();
	if (return2.equalsIgnoreCase("Y")) {
		book2.setIssue(false);
	}
	
	System.out.println("\n    Status after issue: ");
	book1.display();
	book2.display();
}
}
