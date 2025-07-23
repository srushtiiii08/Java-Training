package com.techlabs.controllable;

import java.util.Scanner;

import com.techlabs.model.Fan;
import com.techlabs.model.IControllable;
import com.techlabs.model.Light;
import com.techlabs.model.Speaker;
import com.techlabs.model.TV;

public class ControllableTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean on = true;
	
	while (on) {
		System.out.println("\n---Smart Home---");
		System.out.println("1. Light");
		System.out.println("2. Fan");
		System.out.println("3. TV");
		System.out.println("4. Speaker");
		System.out.println("5. Exit");
		System.out.println("Select a device to control (1-5): ");
		int choice;
		try {								//Integer.parseint converts the String returned from scanner.nextLine() into an int by parsing it.
			choice = Integer.parseInt(sc.nextLine());	//sc.nextline reads an entire line of input from the user as a String
		} catch (Exception e) {
			System.out.println("Invalid input! Please enter a number from 1 to 5.");
			continue;
		}
		
		IControllable device = null;
		String deviceName = "";
		String validModes = "";
		
		switch (choice) {
		case 1:
			device = new Light();
			deviceName = "Light";
			validModes= "Dim, Bright";
			break;
		case 2:
			device = new Fan();
			deviceName = "fan";
			validModes= "High, low";
			break;
		case 3:
			device = new TV();
			deviceName = "TV";
			validModes= "HD, SD";
			break;
		case 4:
			device = new Speaker();
			deviceName = "Speaker";
			validModes= "Bass, Low pitch";
			break;
		case 5:
			on = false;
			System.out.println("Exiting smart home controller..");
			continue;
		default:
			System.out.println("Invalid choice! please choose a valid device");
			continue;
		}
		
		try {
			System.out.println();
			device.turnOn();
			System.out.println("Enter mode for "+deviceName+ " (Options: " +validModes+ "): ");
			String mode = sc.nextLine();
			device.setMode(mode);
			device.turnOff();
		} catch (Exception e) {
			System.out.println("Error controlling "+deviceName+ ": " +e);
		}
	}
	sc.close();
	}
}
