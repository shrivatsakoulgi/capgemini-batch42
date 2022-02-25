package com.capgemini.multithreading.driver;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		
		System.out.println("MyThread2 Current Thread:"+Thread.currentThread().getName());
		
		for(int i=0;i<10;i++) {
			System.out.println("Inside Runnable Thread..");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
