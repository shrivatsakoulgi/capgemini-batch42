package com.capgemini.entity;

public class Car {
	
	private String name;
	private String fuelType;
	private int engineCapacity;
	private int noOfGears;
	private float mileage;
	private float power;
	
	public Car(String name, String fuelType, int engineCapacity, int noOfGears,
			float mileage, float power) {
		this.name = name;
		this.fuelType = fuelType;
		this.engineCapacity = engineCapacity;
		this.noOfGears = noOfGears;
		this.mileage = mileage;
		this.power = power;
	}
	
	public void displayFeatures(){
		System.out.println("Car Name:"+name);
		System.out.println("Fuel Type:"+fuelType);
		System.out.println("Engine Capacity:"+engineCapacity);
		System.out.println("No of Gears:"+noOfGears);
		System.out.println("Mileage:"+mileage);
		System.out.println("Power:"+power);
		System.out.println();
	}
	
	public void accelerate(){
		System.out.println(name+" Car is accelerating...");
	}
	
	public void applyBrake(){
		System.out.println(name+" Car is slowing/stopping...");
	}

	public void steer(){
		System.out.println(name+" Car is changing directions...");
	}
	
	public void changeGears(){
		System.out.println(name+" Car is changing Gears...");
	}
	

	
	
}
