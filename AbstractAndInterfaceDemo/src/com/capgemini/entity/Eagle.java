package com.capgemini.entity;

public class Eagle implements Bird {

	@Override
	public void eat() {
		System.out.println("Eagle eats small animals like Rabbit/Mice/Snake etc..");

	}

	@Override
	public void fly() {
		System.out.println("Eagle flies very high across the sky...");

	}
	
	protected void finalize(){
		//
		System.err.println("\n... Calling Garbage Collection for Eagle Object...");
		System.err.println("Removing the Object now :"+this.hashCode()+"\n");
	}

}
