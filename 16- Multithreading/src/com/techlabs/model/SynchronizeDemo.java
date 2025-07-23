package com.techlabs.model;

public class SynchronizeDemo implements Runnable{

	public static int count = 0;
	
	public synchronized void counterProtection() {
		count++;
	}
	
	@Override
	public void run() {
		for (int i=1; i<=1000; i++) {
			counterProtection();
		}
	}
	
}
