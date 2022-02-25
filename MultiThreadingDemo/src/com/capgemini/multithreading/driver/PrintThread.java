package com.capgemini.multithreading.driver;

public class PrintThread implements Runnable{
	
	private Table table;
	private int number;

	public PrintThread(Table table,int number) {
		this.table = table;
		this.number=number;
	}


	@Override
	public void run() {
		
		System.out.println("Thread name:"+Thread.currentThread().getName());
		
		try {
			table.printSomething(number);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	

}
