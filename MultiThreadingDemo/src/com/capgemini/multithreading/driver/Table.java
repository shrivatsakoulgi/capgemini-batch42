package com.capgemini.multithreading.driver;

public class Table {
	
	synchronized public void printSomething(int number) throws 
	InterruptedException {
		for(int i=1;i<=10;i++) {
			System.out.println(number+" * "+i+" = "+(number*i));
			Thread.sleep(300);
		}
		System.out.println("--- done---");
	}
}
