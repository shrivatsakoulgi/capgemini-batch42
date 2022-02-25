package com.capgemini.java8.model;

public class NewInterfaceImpl implements NewInterface,NewInterface2{

	@Override
	public void display() {
		
		System.out.println("Overrided Display method "
				+ "in NewInterfaceImpl class");
		
	}

	public void defaultMethod() {
		NewInterface.super.defaultMethod();		// default method of interface 1
		NewInterface2.super.defaultMethod();	// default method of interface 2
	
	}

}
