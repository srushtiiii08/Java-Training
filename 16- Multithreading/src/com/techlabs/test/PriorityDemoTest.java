package com.techlabs.test;

import com.techlabs.model.PriorityDemo;

public class PriorityDemoTest {
public static void main(String[] args) {
	
	PriorityDemo thread1 = new PriorityDemo();
	thread1.setPriority(Thread.MAX_PRIORITY);
	thread1.setName("Max");
	thread1.start();
	
	PriorityDemo thread2 = new PriorityDemo();
	thread2.setPriority(Thread.MIN_PRIORITY);
	thread2.setName("Min");
	thread2.start();
	
	PriorityDemo thread3 = new PriorityDemo();
	thread3.setPriority(Thread.NORM_PRIORITY);
	thread3.setName("normie");
	thread3.start();
	
	PriorityDemo thread4 = new PriorityDemo();
	thread4.setPriority(7);
	thread4.setName("Max");
	thread4.start();
}
}
