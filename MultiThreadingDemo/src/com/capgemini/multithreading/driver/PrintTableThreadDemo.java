package com.capgemini.multithreading.driver;

public class PrintTableThreadDemo {

	public static void main(String[] args) throws InterruptedException {
	
		Table table = new Table();
		Thread thread1 = new Thread(new PrintThread(table,5));
		Thread thread2 = new Thread(new PrintThread(table,8));
		thread1.setName("Thread table5");
		thread2.setName("Thread table8");
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		System.out.println("--- End of Main---");

	}
}
