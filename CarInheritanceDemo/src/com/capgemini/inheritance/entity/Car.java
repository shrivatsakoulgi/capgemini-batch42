package com.capgemini.inheritance.entity;

public class Car {
	
	private String name;
	private String fuelType;
	private int engineCapacity;
	private int numberOfGears;
	private float mileage;
	private float power;
		
	public Car() {
		//name="Car";
	}

	public Car(String name, String fuelType, int engineCapacity,
			int numberOfGears, float mileage, float power) {
		this.name = name;
		this.fuelType = fuelType;
		this.engineCapacity = engineCapacity;
		this.numberOfGears = numberOfGears;
		this.mileage = mileage;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public int getNumberOfGears() {
		return numberOfGears;
	}

	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}

	public float getMileage() {
		return mileage;
	}

	public void setMileage(float mileage) {
		this.mileage = mileage;
	}

	public float getPower() {
		return power;
	}

	public void setPower(float power) {
		this.power = power;
		this.hashCode();
	}

	public void displayFeatures(){
		System.out.println("Car Features...");
		System.out.println("Name:"+name);
		System.out.println("Fuel Type:"+fuelType);
		System.out.println("Engine Capacity:"+engineCapacity+" CC");
		System.out.println("Number of Gears:"+numberOfGears);
		System.out.println("Mileage:"+mileage+" KMPL");
		System.out.println("Power:"+power+" BHP");
		
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
	
	public void changeGears(int gear){
		if(gear<0 || gear>numberOfGears){
			System.out.println("Invalid Gear Selected...");
		}else {
			System.out.println(name+" Car is changing gear to :"
		    +gear);
		}
	}
		
}




