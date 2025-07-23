package com.techlabs.test;
import com.techlabs.model.DaemonThread;

public class DaemonThreadEx {
public static void main(String[] args) {
	
	Thread daemon = new Thread(new DaemonThread());
	
	daemon.setDaemon(true);
	daemon.start();
	
	System.out.println("Thread 1 is running");
	try {
		Thread.sleep(3000);     //3000ms
	} catch (InterruptedException e) {
		System.out.println("Thread 1 interrupted");
	}
	
	System.out.println("Main thread is done!");
	
}
}
