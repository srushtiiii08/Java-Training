package com.techlabs.model;

public class HalfStepDownTune implements ITuneBehaviour{

	@Override
	public void tune() {
		System.out.println("Guitar tuned with half step down tune");
	}

}
