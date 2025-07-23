package com.techlabs.TwoDimArray;

import java.util.Scanner;

public class TransposeArray {
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
	
	//transpose
	System.out.println("\nThe transpose of the given matrix is: ");
	int[][] newMatrix = new int[colSize][rowSize];
	for (int i=0; i<colSize; i++) {
		System.out.println();
		for(int j=0; j<rowSize; j++) {
			newMatrix[i][j] = matrix[j][i];
			System.out.print(newMatrix[i][j] + " ");
		}
	}
}
}
