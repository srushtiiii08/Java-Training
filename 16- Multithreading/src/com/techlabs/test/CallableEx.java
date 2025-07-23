package com.techlabs.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableEx {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	
//	ExecutorService service = Executors.newCachedThreadPool();
	ExecutorService service = Executors.newFixedThreadPool(3);
	
	for (int i=1; i<= 5; i++) {
		Callable<String> task = () -> {
			Thread.sleep(500);
			return "Result from thread: " +Thread.currentThread().getName();
		};
		Future<String> res = service.submit(task);
		System.out.println(res.get());
	}
		
	
}
}
