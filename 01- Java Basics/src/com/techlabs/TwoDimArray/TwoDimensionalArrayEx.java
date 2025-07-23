package com.techlabs.TwoDimArray;

import java.util.Scanner;

public class TwoDimensionalArrayEx {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the row size: ");
	int rowSize = scanner.nextInt();
	
	System.out.println("Enter the column size: ");
	int colSize = scanner.nextInt();
	
	int[][] matrix = new int[rowSize][colSize];
	
	System.out.println("Enter the elements: ");

	for (int i=0; i<rowSize; i++) {            //insert row elements
		for (int j=0; j<colSize; j++) {			//insert col elements
			matrix[i][j] = scanner.nextInt();     //takes input
		}
	}
	
	System.out.print("Entered elements are: ");
	for (int i=0; i<rowSize; i++) {            //insert row elements
		System.out.println();			
		for (int j=0; j<colSize; j++) {			//insert col elements
			System.out.print(matrix[i][j] + " ");    //display input
		}
	}
	
}
}
