package com.techlabs.Work.model;

public class Robot implements IWorkable{

	@Override
	public void start() {
		System.out.println("Robot started");
	}

	@Override
	public void stop() {
		System.out.println("Robot stopped");
	}

}
