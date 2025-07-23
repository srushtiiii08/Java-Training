package com.techlabs.test;

import com.techlabs.model.SleepDemo;

public class SleepDemoTest {
	public static void main(String[] args) {
		
		new SleepDemo("Alpha", 4).start();
		new SleepDemo("Beta", 8).start();
		
		new SleepDemo("gamma", 2).start();
	}
}
