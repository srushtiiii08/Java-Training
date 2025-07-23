package com.techlabs.model;

public class AcousticGuitar extends Guitar{

	public AcousticGuitar() {
		playBehaviour = new PlayWithPick(); 
		tuneBehaviour = new DropTuning();
		effectBehaviour = new ChorusEffect();
	}
	
	@Override
	public void display() {
		System.out.println("   ----Acoustic Guitar----");
	}

}
