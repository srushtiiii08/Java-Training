package com.techlabs.test;

import com.techlabs.model.MyThreadUsingClass;

public class MyThreadClassTest {
public static void main(String[] args) {
	
	MyThreadUsingClass thread1 = new MyThreadUsingClass();
	thread1.start();
	
	MyThreadUsingClass thread2 = new MyThreadUsingClass();
	thread2.start();
}
}
