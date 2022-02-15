package com.capgemini.inheritance.entity;

public class SUV extends Car {

	private String driveMode;
	private boolean sunRoof;
	
	public SUV() {
		
	}

	public SUV(String name, String fuelType, int engineCapacity,
			int numberOfGears, float mileage, float power, String driveMode, boolean sunRoof) {
		
		super(name, fuelType, engineCapacity, numberOfGears, mileage, power);
		this.driveMode=driveMode;
		this.sunRoof=sunRoof;
		
	}

	public String getDriveMode() {
		return driveMode;
	}

	public void setDriveMode(String driveMode) {
		
		this.driveMode = driveMode;
		System.out.println("Drive Mode changed to:"+this.driveMode+" -----");
	}

	public boolean isSunRoof() {
		return sunRoof;
	}

	public void setSunRoof(boolean sunRoof) {
		this.sunRoof = sunRoof;
	}
	
	@Override
	public void displayFeatures(){
		System.out.println("SUV Features...");
		super.displayFeatures();
		
		System.out.println("Drive Mode:"+driveMode);
		System.out.println("Sun Roof:"+sunRoof);
		System.out.println();
	}
	
	// ECO, CITY, SPORTS
	@Override
	public void accelerate(){
		if(driveMode.equalsIgnoreCase("ECO")){
			System.out.println(getName()+" is accelerating slowly in ECO Mode");
		}
		else if(driveMode.equalsIgnoreCase("CITY")){
			System.out.println(getName()+" is accelerating Moderately in CITY Mode");
		}
		else if(driveMode.equalsIgnoreCase("SPORTS")){
			System.out.println(getName()+" is accelerating Rapidly in SPORTS Mode");
		}else {
			System.out.println("---- Invalid Drive Mode selected.!!----");
		}
	}
	
	public void extraMethod(){
		System.out.println("Extra method..not there in Car class...");
	}

}
