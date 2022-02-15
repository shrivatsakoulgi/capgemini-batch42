package com.capgemini.driver;

import com.capgemini.entity.Car;

public class CarDemo {

	public static void main(String[] args) {
		
		Car nexon = new Car("Nexon", "Petrol", 1200, 6, 12.3f, 93.5f);
		nexon.displayFeatures();
		nexon.accelerate();
		nexon.changeGears();
		nexon.steer();
		nexon.applyBrake();
		System.out.println();
		
		Car []cars = new Car[4];	// Creates array of references
		
		cars[0]=new Car("Swift", "Petrol", 1200, 6, 12.3f, 93.5f);
		cars[1]=new Car("Vitara Breza", "Diesel", 1500, 6, 12.3f, 83.5f);
		cars[2]=new Car("Tata Hexa", "Diesel", 2400, 6, 12.3f, 123.5f);
		cars[3]=new Car("Toyota Innova", "Diesel", 2700, 6, 12.3f, 150.5f);
		
		for(Car c:cars){
			c.displayFeatures();
			
		}
		
		System.out.println(nexon);
		
	}

}
