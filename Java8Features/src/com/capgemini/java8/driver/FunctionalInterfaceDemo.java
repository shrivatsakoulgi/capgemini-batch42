package com.capgemini.java8.driver;

import com.capgemini.java8.model.InterfaceA;
import com.capgemini.java8.model.InterfaceAImpl;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		InterfaceA interfaceA = new InterfaceAImpl();
		interfaceA.display(10,100);  		// 1st method	
		InterfaceA iA2 = new InterfaceA() {
			
			@Override
			public void display(int a,int b) {
				System.out.println("Display of iA2 using Anonymous inner class:"+a);
				
			}
		};
		
		iA2.display(20,400);
		
		InterfaceA iA3 = ((a,b)->{System.out.println("Value of a is using Lamda expression:"+a+" "+b);});		// Implemented (SAM) interface by 
																												//overriding display method
																										// using lambda expression
		iA3.display(4,16);
		Thread thread = new Thread(new Runnable() {		// Anonymous inner class
			
			@Override
			public void run() {
				System.out.println("Inside Runnable thread..");
				
			}
		});
		
		thread.start();
		
		Thread thread2 = new Thread(()->{System.out.println("Inside Thread..Lambda Expression...");});
		thread2.start();

	}

}
