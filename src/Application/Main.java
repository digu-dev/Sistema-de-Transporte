package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CargoVehicle;
import model.entities.PassengerVehicle;
import model.entities.Vehicle;
import model.exception.CapacityExceededException;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Vehicle> list = new ArrayList<>();
		
		
		try {
			System.out.print("Enter the number o vehicles: ");
			int n = sc.nextInt();
			
			for (int i = 1; i <= n; i++) {
				System.out.println();
				System.out.println("Vehicle #" + i);
				sc.nextLine();
				System.out.print("Type (passenger/cargo) ? ");
				String answer = sc.nextLine();
				System.out.print("Plate: ");
				String plate = sc.nextLine();
				System.out.print("Capacity: ");
				Integer capacity = sc.nextInt();
				sc.nextLine();
				if (answer.equalsIgnoreCase("passenger")) {
					System.out.print("Passenger type: ");
					String passengerType = sc.nextLine();
					System.out.print("Passenger to board: ");
					int requested = sc.nextInt();
					
					Vehicle vehicle = new PassengerVehicle(plate, capacity, requested, passengerType);
					list.add(vehicle);
					
				}else if (answer.equalsIgnoreCase("cargo")) {
					System.out.print("Max Weight: ");
					Double maxWeight = sc.nextDouble();
					System.out.print("Requested Weight: ");
					double requestedWeight = sc.nextDouble();
					
					Vehicle vehicle = new CargoVehicle(plate, capacity, requestedWeight, maxWeight);
					list.add(vehicle);
				}else {
					System.out.println("Error: Type of Vehicle not registered");
				}
			}

		} catch (CapacityExceededException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		for(Vehicle vehicle : list) {
			System.out.println(vehicle.info());
		}
		
		
		
		sc.close();
	}

}
