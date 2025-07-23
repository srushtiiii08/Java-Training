package com.techlabs.model;

public class DaemonThread implements Runnable{


	@Override
	public void run() {
		while (true) {
			System.out.println("Deamon thread is running..");  //this will be printed while the main executes completely
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Daemon thread is interrupted!!");
				break;
			}
		}
	}
}
