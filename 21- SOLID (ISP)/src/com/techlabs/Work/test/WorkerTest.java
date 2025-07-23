package com.techlabs.Work.test;

import com.techlabs.Work.model.IWorkable;
import com.techlabs.Work.model.IWorker;
import com.techlabs.Work.model.Labour;
import com.techlabs.Work.model.Robot;

public class WorkerTest {
public static void main(String[] args) {
	
	IWorker labour = new Labour();
	
	labour.start();
	labour.stop();
	labour.eat();
	labour.rest();
	
	System.out.println("---------------------");
	
	IWorkable robot = new Robot();
	robot.start();
	robot.stop();
}
}
