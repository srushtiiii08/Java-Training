package com.techlabs.test;

import com.techlabs.model.SynchronizeDemo;

public class SynchronizeDemoTest {
public static void main(String[] args) throws InterruptedException {
	
	SynchronizeDemo counter = new SynchronizeDemo();
	
	Thread t1 = new Thread(new SynchronizeDemo());
	Thread t2 = new Thread(new SynchronizeDemo());
	
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	
	System.out.println("Final count is: " + counter.count);

}
}
