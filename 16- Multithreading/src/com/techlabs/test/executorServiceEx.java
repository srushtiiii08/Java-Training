package com.techlabs.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executorServiceEx {
public static void main(String[] args) {
	
//	ExecutorService service2 = Executors.newCachedThreadPool();   //for dynamic size--make as many threads as required for tasks
	ExecutorService service = Executors.newFixedThreadPool(3);  //will make 4 threads, these 4 threads will restart if tasks are more than thread
	
			//advised to create less threads than task to prevent wastage of resources
	
	Runnable task1 = () ->  System.out.println("task 1 by: " + Thread.currentThread().getName());
	Runnable task2 = () -> { System.out.println("task 2 by: " + Thread.currentThread().getName());};
	Runnable task3 = () -> { System.out.println("task 3 by: " + Thread.currentThread().getName());};
	Runnable task4 = () -> { System.out.println("task 4 by: " + Thread.currentThread().getName());};

	service.submit(task1);
	service.submit(task2);
	service.submit(task3);
	service.submit(task4);
	
	service.shutdown();   //to terminate all threads
	
	
}
}
