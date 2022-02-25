package com.capgemini.multithreading.driver;

public class ThreadDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1 = new Thread(new MyThread2());
		thread1.setName("RunnableThread1");
		thread1.start();
	
		Thread.currentThread().setName("Main Thread");
		System.out.println("Main Thread:"+Thread.currentThread().getName());
		thread1.join();
		for(int i=0;i<10;i++) {
			System.out.println("Inside Main..");
			Thread.sleep(500);
		}
		
		Thread thread2 = new Thread(new MyThread2());
		thread2.start();
		thread2.join();
		System.out.println("----End of Main----");

	}

}
