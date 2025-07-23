package com.techlabs.TwoDimArray;

import java.util.Scanner;

public class SquareMatrix {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the size of rows: ");
	int rowSize = scanner.nextInt();
	
	System.out.println("Enter the size of columns: ");
	int colSize = scanner.nextInt();
	
	int[][] matrix = new int[rowSize][colSize];
	
	if (rowSize != colSize) {
		System.out.println("Provide same size for both rows & column!");
	}
	else {
		System.out.println("Enter the numbers: ");
		for (int i=0; i<rowSize; i++) {
			for (int j=0; j<colSize; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		System.out.print("Entered elements are: ");
		for (int i=0; i<rowSize; i++) {            
			System.out.println();			
			for (int j=0; j<colSize; j++) {			
				System.out.print(matrix[i][j] + " ");    
			}
		}
	}
	
	
	

	
	
	
}
}
