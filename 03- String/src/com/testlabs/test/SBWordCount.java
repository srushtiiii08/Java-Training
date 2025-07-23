package com.testlabs.test;

public class SBWordCount {
public static void main(String[] args) {
	String str1 = "hi hi hi hello java hii python";
	String word = "hi";
	
	String[] wordarr=str1.split(" ");
	int count=0;
	for (String res : wordarr) {
		if(res.equals(word)) {
			count++;
		}
	}
	System.out.println("Total count: " + count);
}
}
