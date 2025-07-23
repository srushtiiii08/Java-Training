package com.techlabs.test;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("demo");
		
		if (file.createNewFile()) {
			System.out.println("File created successfully");
		} else {
			System.out.println("File already exists");
		}
	}
}
