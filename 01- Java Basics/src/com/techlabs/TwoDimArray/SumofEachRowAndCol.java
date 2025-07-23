package com.techlabs.TwoDimArray;

import java.util.Scanner;

public class SumofEachRowAndCol {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the size of rows: ");
	int rowSize = scanner.nextInt();
	
	System.out.println("Enter the size of columns: ");
	int colSize = scanner.nextInt();
	
	int[][] matrix = new int[rowSize][colSize];
	
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
	
	
	for (int i=0; i<rowSize; i++) {
		int rowSum = 0;
		for (int j=0; j<colSize; j++) {
			rowSum += matrix[i][j];
		}
	System.out.println("\nSum of row " + i + " is " + rowSum);
		}
	
	for (int i=0; i<rowSize; i++) {
		int colSum = 0;
		for (int j=0; j<colSize; j++) {
			colSum += matrix[j][i];
		}
	System.out.println("\nSum of col " + i + " is " + colSum);
		}
}
}
