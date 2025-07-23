package com.techlabs.model;

public class SleepDemo extends Thread {

	public SleepDemo(String name, int priority) {
		setName(name);
		setPriority(priority);
	}

	public void run() {
		for (int i=1; i<=5; i++) {
			System.out.println(getName() + ": "+ i);
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
