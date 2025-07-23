package com.techlabs.test;

import java.io.File;

public class RenameFileDemo {
	
	public static void main(String[] args) {
		File old = new File("demo.xlsx");
		
		File newFile = new File("newFile.xlsx");
		
		if (old.renameTo(newFile)) {
			System.out.println("File renamed successfully");
		}else {
			System.out.println("File rename unsuccessful");
		}
	}

}
