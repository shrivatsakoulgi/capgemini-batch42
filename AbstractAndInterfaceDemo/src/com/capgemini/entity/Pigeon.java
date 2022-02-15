package com.capgemini.entity;

public class Pigeon implements Bird {

	@Override
	public void eat() {
		System.out.println("Pigeon Eats Grains...");
		
	}

	@Override
	public void fly() {
		System.out.println("Pigeon Flies over the building..");
		
	}

	protected void finalize(){
		//
		System.err.println("\n... Calling Garbage Collection"
				+ " for Pigeon Object...");
		System.err.println("Removing the Object now :"
				+this.hashCode()+"\n");
	}

	public void someMethod(){
		Rectangle rectangle = new Rectangle(10, 20);
		rectangle.display();
	}

}


