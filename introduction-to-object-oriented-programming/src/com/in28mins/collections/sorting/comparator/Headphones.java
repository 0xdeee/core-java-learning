package com.in28mins.collections.sorting.comparator;

public class Headphones {

	private String make;
	private String model;
	private double price;
	private double rating;
	private double battery_backup;

	public Headphones(String make, String model, double price, double rating, double battery_backup) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.rating = rating;
		this.battery_backup = battery_backup;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getBattery_backup() {
		return battery_backup;
	}

	public void setBattery_backup(double battery_backup) {
		this.battery_backup = battery_backup;
	}

	@Override
	public String toString() {
		return "[make=" + make + ", model=" + model + ", price=" + price + ", rating="
				+ rating + ", battery_backup=" + battery_backup + "]" + "\n";
	}

}
