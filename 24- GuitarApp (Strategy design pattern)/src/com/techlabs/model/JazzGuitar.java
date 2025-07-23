package com.techlabs.model;

public class JazzGuitar extends Guitar{

	public JazzGuitar() {
		playBehaviour = new PlayByTapping(); 
		tuneBehaviour = new DropTuning();
		effectBehaviour = new ChorusEffect();
	}
	@Override
	public void display() {
		System.out.println("     ----Jazz Guitar----");
	}

}
