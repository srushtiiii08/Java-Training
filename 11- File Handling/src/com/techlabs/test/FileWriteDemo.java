package com.techlabs.test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
	public static void main(String[] args) throws IOException {
		FileWriter write = new FileWriter("demo.txt", true);   //if using throws, .close() must be used
		write.append("\nHello World. \nThis is Srushti");    //if dont want to use .close(), then use try catch
		write.close();										// if using .write() -- then it will override the same text but not make another like in .append
		
		System.out.println("Write operation done successfully");
	}

}
