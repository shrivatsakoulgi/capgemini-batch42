package com.capgemini.multithreading.driver;

public class ThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread thread1 = new MyThread();
		thread1.start();  	//start the execution of thread
		
		for(int i=0;i<10;i++) {
			System.out.println("Inside Main..");
			Thread.sleep(500);		// Thread sleeps for 0.5 second.
		}

	}

}
