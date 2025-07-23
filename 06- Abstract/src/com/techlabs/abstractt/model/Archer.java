package com.techlabs.abstractt.model;
import com.techlabs.abstractt.model.GameCharacter;

public class Archer extends GameCharacter{

	public Archer(String name, int powerLevel) {
		super(name, powerLevel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		powerLevel -=5;
	}

}
