package com.techlabs.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.techlabs.model.BikeVC;
import com.techlabs.model.CarVC;
import com.techlabs.model.IVehicleControl;
import com.techlabs.model.TruckVC;

public class VehicleControlTest {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

    IVehicleControl[] vehicles = { new CarVC(), new BikeVC(), new TruckVC() };

    while (true) {
        try {
            System.out.println("\n==== Vehicle Control Panel ====");
            for (int i = 0; i < vehicles.length; i++) {
                System.out.println((i + 1) + ". " + vehicles[i].getVehicleType());
            }
            System.out.println("0. Exit");

            int choice = -1;
            while (choice < 0 || choice > vehicles.length) {
                System.out.print("Select a vehicle (0 to exit): ");
                try {
                    choice = sc.nextInt();
                    if (choice < 0 || choice > vehicles.length) {
                        System.out.println("Please choose a valid option.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid number.");
                    sc.next(); 
                }
            }

            if (choice == 0) {
                System.out.println("Exiting Vehicle Controller.");
                break;
            }

            IVehicleControl selected = vehicles[choice - 1];

            try {
                selected.start();
            } catch (Exception e) {
                System.out.println("Failed to start vehicle: " + e.getMessage());
            }

            int gear = 0;
            while (gear < 1 || gear > 6) {
                System.out.print("Enter gear (1 to 6): ");
                try {
                    gear = sc.nextInt();
                    if (gear < 1 || gear > 6) {
                        System.out.println("Gear must be between 1 and 6.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    sc.next(); 
                }
            }

            try {
                selected.changeGear(gear);
            } catch (Exception e) {
                System.out.println("Failed to change gear: " + e.getMessage());
            }

            try {
                selected.stop();
            } catch (Exception e) {
                System.out.println("Failed to stop vehicle: " + e.getMessage());
            }

            sc.nextLine(); 

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
            sc.nextLine();
        }
    }

    sc.close();

}
}
