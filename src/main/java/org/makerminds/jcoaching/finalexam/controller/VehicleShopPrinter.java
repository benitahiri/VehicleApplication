package org.makerminds.jcoaching.finalexam.controller;

import java.util.List;

import org.makerminds.jcoaching.finalexam.model.Vehicle;

/**
 * responsible for printing vehicle shop data.
 * 
 * @author <arb-tah>
 *
 */
public class VehicleShopPrinter {
	
	
	
	public  void printAvailableVehicles(List<Vehicle> vehicleList) {
		// TODO Implement print available vehicles
		
		System.out.println("List of Vehicles:");
		System.out.println("-----------------------");
	    for (Vehicle vehicle : vehicleList) {
	        System.out.println("ID: " + vehicle.getId() + " . " 
	            + "Manufacturer: " + vehicle.getManufacturer() + " . " 
	            + "Model: " + vehicle.getModel() + " . " 
	            + "Horsepower: " + vehicle.getHorsePower() + " . " 
	            + "Price: " + vehicle.getPrice() + " . " 
	            + "Color: " + vehicle.getColor() + " . " 
	            + "Mileage: " + vehicle.getMileage() + " . " 
	            + "Production Year: " + vehicle.getProductionYear() + " . " 
	            + "Fuel Type: " + vehicle.getFuelType() + " . " 
	            + "Transmission: " + vehicle.getTransmission() + ".");
		}
		
	/*	System.out.println("\nAvailable Vehicles:");
		for(Vehicle vehicle : vehicleList) {
			System.out.println(vehicle); */
		
	}

	public  void printVehicleSoldMessage(int vehicleChosenId) {
		// \n in a String will cause a line break
		System.out.println("\n" + "Vehicle with ID " + vehicleChosenId + " was sold.");
		System.out.println("----------------------------------------------------------");
	}
	
	public void printVehicleIdToSellRequest() {
		// \n in a String will cause a line break
		System.out.println("\n\n Please enter the number (ID) of the vehicle you want to sell: ");
	}
}
