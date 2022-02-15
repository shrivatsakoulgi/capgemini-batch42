package com.capgemini.entity;

public abstract class Shape {
	private int numberOfSides;
	
	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

	public abstract void area();		// abstract method
	
	

	
}
