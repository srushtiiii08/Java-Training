package com.techlabs.model;

public class ClassicalGuitar extends Guitar{
	
	public ClassicalGuitar() {
		playBehaviour = new PlayByTapping(); 
		tuneBehaviour = new DropTuning();
		effectBehaviour = new ChorusEffect();
	}
	

	@Override
	public void display() {
		System.out.println("    ----Classical Guitar----");
	}

}
