package com.capgemini.entity;

public class Bat implements Mammal,Bird{
	
	@Override
	public void eat(){
		System.out.println("Bat eats insects...");
	}
	
	@Override
	public void feed(){
		System.out.println("Bat feeds their pups..");
	}
	
	@Override
	public void fly(){
		
		System.out.println("Bat flies in the Caves..");
	}

}
