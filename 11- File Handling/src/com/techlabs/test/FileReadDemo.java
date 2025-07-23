package com.techlabs.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReadDemo {

	public static void main(String[] args) throws IOException, FileNotFoundException {
//		BufferedReader reader = new BufferedReader(new FileReader("demo.txt"));
//		
//		String line;
//		
//		while((line = reader.readLine())!= null) {    //using loop cz .readline() only reads the 1 line
//			System.out.println(line);				//in order to read the whole file we use while loop
//		}
//		reader.close();
		
		File file = new File("demo.java");
		Scanner sc = new Scanner(file);
		
		while (sc.hasNextLine()) {		//hasNextLine returns true if there is another line to read
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
	}
}
