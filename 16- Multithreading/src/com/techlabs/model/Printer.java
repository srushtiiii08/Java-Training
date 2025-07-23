package com.techlabs.model;

public class Printer {

	public void print(String doc) {
		synchronized(this) {
			System.out.println(Thread.currentThread().getName() + " printing: " +doc);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " finished printing: " +doc);

		}
		
	}
}
