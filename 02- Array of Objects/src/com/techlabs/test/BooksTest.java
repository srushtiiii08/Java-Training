package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Books;

public class BooksTest {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	Books[] bookarr = new Books[4];
	
	System.out.println("Enter details of 4 books: ");
	for (int i=0; i<4; i++) {
		System.out.println("Enter book title: ");
		String booktitle = scanner.nextLine();
		
		System.out.println("Enter book ID: ");
		int bookid = scanner.nextInt();
		
		scanner.nextLine();
		
		bookarr[i] = new Books(booktitle, bookid);
	}
	
		System.out.println("What would you like to know: \n1. Book Title \n2. Book ID ");
		int choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			for (Books result:bookarr) {
				result.display();
			}
			break;
		case 2:
			for (Books result:bookarr) {
				result.displayID();
			}
			break;
		default : 
			System.out.println("Enter valid input!");
		}
	
}
}
