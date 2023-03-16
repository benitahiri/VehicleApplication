package org.makerminds.jcoaching.finalexam.controller;



import java.util.List;

import org.makerminds.jcoaching.finalexam.model.Vehicle;

/**
 * responsible for processing business processes.
 * 
 * @author <arb-tah>
 *
 */
public class VehicleShopProcessor {
	
	/**
	 * responsible to sell a specified vehicle by id
	 * @param vehiclesList
	 * @param vehicleChosenId
	 */
	
	public void sellVehicle(List<Vehicle> vehiclesList, int vehicleChosenId) {
	    // TODO selling a vehicle means to remove it from the available vehicle list
	    // Hint: use while loop to safely remove an oject from a lst
		for (int i = 0; i < vehiclesList.size(); i++) {
	        Vehicle vehicle = vehiclesList.get(i);
	        if (vehicle.getId() == vehicleChosenId) {
	            // Remove the vehicle from the list of available vehicles
	            vehiclesList.remove(i);
	            break; 
	            
	   
	        }}}
}
