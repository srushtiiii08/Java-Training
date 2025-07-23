package com.techlabs.test;

import java.io.File;

public class DeleteFileDemo {
public static void main(String[] args) {
	File file = new File("demo.pdf");
//	
//	if (file.delete()) {
//		System.out.println(file.getName()+ " deleted");
//	} else {
//		System.out.println("File does not exist");
//	}
	
	System.out.println(file.delete());
}
}
