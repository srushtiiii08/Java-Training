package com.techlabs.Enum.test;

import com.techlabs.Enum.model.TrafficSignal;
import com.techlabs.Enum.model.TrafficSignalmethod;

public class TrafficSignalTest {
public static void main(String[] args) {
	
	TrafficSignalmethod trf = new TrafficSignalmethod();
	trf.getAction(TrafficSignal.RED);
	
//	for (TrafficSignal signal: TrafficSignal.values()) {
//		System.out.println(signal + "-->" + signal.getAction());
//	}
}
}
