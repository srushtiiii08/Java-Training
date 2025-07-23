package com.techlabs.Enum.model;

public class TrafficSignalmethod {
	
	public void getAction(TrafficSignal ts) {
		switch(ts) {
		case RED:
			System.out.println("stop");
			break;
		case YELLOW:
			System.out.println("Get Ready");
			break;
		case GREEN:
			System.out.println("Go");
			break;
		}
	}

}
