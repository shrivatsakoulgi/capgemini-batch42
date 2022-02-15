package com.capgemini.entity;

public class Tiger implements Mammal {

	@Override
	public void eat() {
		
		System.out.println("Tiger is Carnivorous..."
				+ " It eats other small animals.");

	}

	@Override
	public void feed() {
		System.out.println("Tiger feeds its Cub..");

	}

}
