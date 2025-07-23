package com.techlabs.model;

public class MyThreadUsingClass extends Thread{

	@Override
	public void run() {
		System.out.println("Thread running is: " +Thread.currentThread().getName());
	}
	
}
