package org.makerminds.jcoaching.finalexam.controller;

import java.util.ArrayList;
import java.util.List;

import org.makerminds.jcoaching.finalexam.model.Color;
import org.makerminds.jcoaching.finalexam.model.FuelType;
import org.makerminds.jcoaching.finalexam.model.Manufacturer;
import org.makerminds.jcoaching.finalexam.model.Transmission;
import org.makerminds.jcoaching.finalexam.model.Vehicle;

/**
 * responsible for transforming vehicle data into {@link Vehicle} objects.
 * 
 * @author <arb-tah>
 *
 */
public class VehicleTransformer {
	
	/**
	 * transforms a data array into a {@link Vehicle} list 
	 * @param vehicle data array
	 * @return list of {@link Vehicle} objects
	 */
	public List<Vehicle> transformDataArrayToVehicleObjects(List<String> vehicleDataArray) {
		// TODO take data from String list and transform to list of vehicle objects
		// TODO call method transformToVehicleObject
		// Hint: use for loop
		
		List<Vehicle> vehicleList = new ArrayList<>();
		for (String vehicleAsString : vehicleDataArray) {
			Vehicle vehicle = transformToVehicleObject(vehicleAsString);
			vehicleList.add(vehicle);
		}
		return vehicleList;
	
	}

	/**
	 * transforms a vehicle data record as String into a {@link Vehicle} object
	 * @param vehicle data record as String 
	 * @return {@link Vehicle} object
	 */
	private Vehicle transformToVehicleObject(String vehicleAsString) {
		// TODO transform the vehicle as string into a vehicle object
		// Hint: use the split(String) method of a String to define where to split the 
		// String. In this case split on every comma (;)
		
		String[] vehicleStringArray = vehicleAsString.split(",");
		Vehicle vehicle = new Vehicle();
		int vehicleID = Integer.valueOf(vehicleStringArray[0]);
		vehicle.setId(vehicleID);
		String manufacturerAsString = vehicleStringArray[1];
		Manufacturer manufacturer = generateManufacturer(manufacturerAsString);
		vehicle.setManufacturer(manufacturer);
		String model = vehicleStringArray[2];
		vehicle.setModel(model);
		int horsePower = Integer.valueOf(vehicleStringArray[3]);
		vehicle.setHorsePower(horsePower);
		double price = Double.valueOf(vehicleStringArray[4]);
		vehicle.setPrice(price);
		String colorAsString = vehicleStringArray[5];
		Color color = generateColor(colorAsString);
		vehicle.setColor(color);
		int mileage = Integer.valueOf(vehicleStringArray[6]);
		vehicle.setMileage(mileage);
		int productionYear = Integer.valueOf(vehicleStringArray[7]);
		vehicle.setProductionYear(productionYear);
		String fuelTypeAsString = vehicleStringArray[8];
		FuelType fuelType = generateFuelType(fuelTypeAsString);
		vehicle.setFuelType(fuelType);
		String transmissionAsString = vehicleStringArray[9];
		Transmission transmission = generateTransmission(transmissionAsString);
		vehicle.setTransmission(transmission);
		
		
		
		
		
		
		
		return vehicle;
		
		/*String[] vehicleData = vehicleAsString.split(",");
		int id = Integer.valueOf(vehicleData[0]);
		String manufacturer = vehicleData[1];
		String model = vehicleData[2];
		int horsePower = Integer.valueOf(vehicleData[3]);
		double price = Double.valueOf(vehicleData[4]);
		String color = vehicleData[5];
		int mileage = Integer.valueOf(vehicleData[6]);
		int productionYear = Integer.valueOf(vehicleData[7]);
		String transmission = vehicleData[8];
		String fuelType = vehicleData[9];
		return new Vehicle(id, manufacturer, model, horsePower, price, color, mileage, productionYear, transmission, fuelType);
                        */
	}

	private FuelType generateFuelType(String fuelTypeAsString) {
		    for(FuelType fuelType : FuelType.values()) { 
		    	if(fuelTypeAsString.toLowerCase().equals(fuelType.toString().toLowerCase()))
		    		return fuelType;
		    }
		
		return null;
	}

	private Transmission generateTransmission(String transmissionAsString) {
		   for(Transmission transmission : Transmission.values()) { 
			   if(transmissionAsString.toLowerCase().equals(transmission.toString().toLowerCase()))
				  return transmission;
		   }
		
		return null;
	}

	private Color generateColor(String colorAsString) {
		    for(Color color : Color.values()) { 
		    	if(colorAsString.toLowerCase().equals(color.toString().toLowerCase()))
		    		return color;
		    }
		 
		
		
		return null;
	}

	private Manufacturer generateManufacturer(String manufacturerAsString) {
	        for(Manufacturer manufacturer : Manufacturer.values()) {
	        	if(manufacturerAsString.toLowerCase().equals(manufacturer.toString().toLowerCase()))
	        		return manufacturer;
	        	}
	        
	       return null;
	}
}
