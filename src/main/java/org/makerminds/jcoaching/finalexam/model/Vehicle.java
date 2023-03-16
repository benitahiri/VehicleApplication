package org.makerminds.jcoaching.finalexam.model;

/**
 * class for vehicle objects.
 * 
 * @author <arb-tah>
 *
 */
public class Vehicle {
	
	// TODO Vehicle implementation
	// TODO add attributes and Getters / Setters
	private int id;
	private Manufacturer manufacturer;
	private String model;
	private int horsePower;
	private double price;
	private Color color;
	private int mileage;
	private int productionYear;
	private FuelType fuelType;
	private Transmission transmission;
	
public Vehicle() {
		
	}
	// constructor
		public Vehicle(int id, Manufacturer manufacturer, String model, int horsePower, double price, Color color, int mileage,
				int productionYear, FuelType fuelType, Transmission transmission) {
			super();
			this.id = id;
			this.manufacturer = manufacturer;
			this.model = model;
			this.horsePower = horsePower;
			this.price = price;
			this.color = color;
			this.mileage = mileage;
			this.productionYear = productionYear;
			this.fuelType = fuelType;
			this.transmission = transmission;
			
			// getters/setters
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Manufacturer getManufacturer() {
			return manufacturer;
		}
		public void setManufacturer(Manufacturer manufacturer) {
			this.manufacturer = manufacturer;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getHorsePower() {
			return horsePower;
		}
		public void setHorsePower(int horsePower) {
			this.horsePower = horsePower;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public Color getColor() {
			return color;
		}
		public void setColor(Color color) {
			this.color = color;
		}
		public int getMileage() {
			return mileage;
		}
		public void setMileage(int mileage) {
			this.mileage = mileage;
		}
		public int getProductionYear() {
			return productionYear;
		}
		public void setProductionYear(int productionYear) {
			this.productionYear = productionYear;
		}
		public FuelType getFuelType() {
			return fuelType;
		}
		public void setFuelType(FuelType fuelType) {
			this.fuelType = fuelType;
		}
		public Transmission getTransmission() {
			return transmission;
		}
		public void setTransmission(Transmission transmission) {
			this.transmission = transmission;
		}
}
		
		