package com.capgemini.entity;

public class Cow implements Mammal{

	@Override
	public void eat() {
		System.out.println("Cow is eating Grass/Fodder...");
		
	}

	@Override
	public void feed() {
		System.out.println("Cow feeds Calf and us as"
				+ " well....");
		
	}

}
