package com.techlabs.abstractt.test;

import com.techlabs.abstractt.model.Archer;
import com.techlabs.abstractt.model.GameCharacter;
import com.techlabs.abstractt.model.Warrior;

public class GameCharacterTest {
public static void main(String[] args) {
	GameCharacter w = new Warrior("Keermada", 100);
	GameCharacter a = new Archer("Chota Bheem", 250);
	
	for(int i=0; i<2; i++) {
		System.out.println("Round " +(i+1)+ " attack: ");
//		System.out.println("----------------------------------");
		w.attack();
		a.attack();
		
		w.showStatus();
		a.showStatus();
	}
}
}
