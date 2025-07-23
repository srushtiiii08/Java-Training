package com.techlabs.model;

public class MyThreadUsingRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread running is: " +Thread.currentThread().getName());		
	}

}
