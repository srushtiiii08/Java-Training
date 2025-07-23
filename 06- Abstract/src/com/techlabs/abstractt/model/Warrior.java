package com.techlabs.abstractt.model;
import com.techlabs.abstractt.model.GameCharacter;

public class Warrior extends GameCharacter{

	public Warrior(String name, int powerLevel) {
		super(name, powerLevel);
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		powerLevel -= 10;
	}

	
}
