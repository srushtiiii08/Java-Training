package com.techlabs.model;

public class PriorityDemo extends Thread{

	@Override
	public void run() {
		System.out.println(getName() +" Priority: "+ getPriority());
	}					// no need to write Thread.currentThread() etc as it is part of Thread class
}
