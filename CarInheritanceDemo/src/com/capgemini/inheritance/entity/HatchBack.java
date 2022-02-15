package com.capgemini.inheritance.entity;

public class HatchBack extends Car {
	
	private boolean ac;
	private String musicSystem;
	
	public HatchBack() {
		super();	
	}
	
	public HatchBack(String name, String fuelType, int engineCapacity,
			int numberOfGears, float mileage, float power,
			boolean ac, String musicSystem) {
		
		super(name, fuelType, engineCapacity, numberOfGears, mileage, power);
		this.ac=ac;
		this.musicSystem=musicSystem;
	}
	
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public void setMusicSystem(String musicSystem) {
		this.musicSystem = musicSystem;
	}
	
	public void displayFeatures(){
		super.displayFeatures();
		System.out.println("AC:"+ac);
		System.out.println("Music System:"+musicSystem);
		System.out.println();
	}

}
