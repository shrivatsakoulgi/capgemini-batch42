package com.capgemini.java8.model;

public interface NewInterface {
	
	void display();		// abstract method
	
	public static void staticPrintSomething() {
		System.out.println("Inside static method of Interface A...");
	}
	
	public default void defaultMethod() {
		System.out.println("Default method of Interface1");
	}

}
