package com.swabhavtechlabs.forloop;

import java.util.Scanner;

public class TreasureIslandApp {
public static void main(String[] args) {
	System.out.println("welcome to Treasure Island. \nYour mission is to find the treasure.\n");
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("left or right?");
	String firstchoice = scanner.nextLine();
	
	if (firstchoice.equalsIgnoreCase("left")) {
		System.out.println("swim or wait?");
		String secondchoice = scanner.nextLine();
		
		if (secondchoice.equalsIgnoreCase("wait")) {
			System.out.println("which door?");
			String thirdchoice = scanner.nextLine();
			
			if (thirdchoice.equalsIgnoreCase("yellow")) {
				System.out.println("You Win!");
			}
			else if (thirdchoice.equalsIgnoreCase("red")) {
				System.out.println("Burned by Fire. \nGame Over.");
			}
			else if (thirdchoice.equalsIgnoreCase("blue")) {
				System.out.println("Eaten by beasts. \nGame Over.");
			}
			else {
				System.out.println("Game Over");
			}
		}
		else {
			System.out.println("Attacked by trout. \nGame Over.");
		}
	}
	else {
		System.out.println("fall into a hole. \nGame Over");
	}
	scanner.close();
}
}
