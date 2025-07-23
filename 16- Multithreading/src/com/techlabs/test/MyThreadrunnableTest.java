package com.techlabs.test;

import com.techlabs.model.MyThreadUsingRunnable;

public class MyThreadrunnableTest {
public static void main(String[] args) {
	

	MyThreadUsingRunnable t1 = new MyThreadUsingRunnable();
	t1.run();
	
	MyThreadUsingRunnable t2 = new MyThreadUsingRunnable();
	t2.run();
	
	
	Thread thread1 = new Thread(new MyThreadUsingRunnable());
	thread1.start();
	
	Thread thread2 = new Thread(new MyThreadUsingRunnable());
	thread2.start();
	
	Thread thread3 = new Thread(new MyThreadUsingRunnable());
	thread3.start();
	
	Thread thread4 = new Thread(new MyThreadUsingRunnable());
	thread4.start();
}
}
