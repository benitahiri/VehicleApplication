package org.makerminds.jcoaching.finalexam.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.makerminds.jcoaching.finalexam.model.Vehicle;

/**
 * managing the file.
 * 
 * @author <arb-tah>
 *
 */
public class VehicleFileManager {
	
	private String filePath;
	
	public VehicleFileManager(String filePath) {
		this.filePath = filePath;
	}
	
	public VehicleFileManager() { 
		
	}
	
	public List<String> importVehiclesFromFile(){
		// TODO read vehicle-list-txt and transform to String array
		// Hint: use java.nio.file.Files and Paths class
		
		
		List<String> vehicleList = null;
		try {
			vehicleList = Files.readAllLines(Paths.get(getClass().getResource(filePath).toURI()));
			
		}catch(IOException | URISyntaxException e) {
			throw new RuntimeException("Vehicle file can not be found");
		}
		
		return vehicleList;
	}
	
	public void rewriteFile(List<Vehicle> vehicleList) {
		// TODO write back into vehicle-list-txt and transform to String array
		// TODO call method prepareTheVehicleForRewriting(StringBuffer, Vehicle)
		// Hint: use java.nio.file.Path and java.nio.file.Paths class
		Path path;
		try {
			path = Paths.get(getClass().getResource(filePath).toURI());
		} catch (URISyntaxException e) {
			throw new RuntimeException("Vehicle file can not be found");
			
			
		}
		
		StringBuffer vehicleStringForRewrite = new StringBuffer();
		for (Vehicle vehicle : vehicleList) {
			prepareTheVehicleForRewriting(vehicleStringForRewrite, vehicle);
		}
		
		try {
			Files.write(path, vehicleStringForRewrite.toString().getBytes());
		} catch (IOException e) {
			throw new RuntimeException("Can not write to vehicle file");
		}
	
	}
	
	private void prepareTheVehicleForRewriting(StringBuffer vehicleStringForRewrite, Vehicle vehicle) {
		// TODO add vehicle attribute information to StringBuffer
		// Hint: vehicleStringForRewrite.append(String)
		vehicleStringForRewrite.append(vehicle.getId()).append(",")
		.append(vehicle.getManufacturer()).append(",")
		.append(vehicle.getModel()).append(",")
		.append(vehicle.getHorsePower()).append(",")
		.append(vehicle.getPrice()).append(",")
		.append(vehicle.getColor()).append(",")
		.append(vehicle.getMileage()).append(",")
		.append(vehicle.getProductionYear()).append(",")
		.append(vehicle.getFuelType()).append(",")
		.append(vehicle.getTransmission()).append(System.lineSeparator());

		    
}
	

}
