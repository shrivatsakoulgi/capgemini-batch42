package com.capgemini.inheritance.driver;

import com.capgemini.inheritance.entity.Car;
import com.capgemini.inheritance.entity.SUV;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		Car car = new Car("Maruti", "Petrol", 1200, 5, 20.3f, 75.4f);
		car.displayFeatures();
		System.out.println();
		SUV duster = new SUV("Duster", "Diesel", 1500, 6, 12.3f, 110f, "Sports", true);
		duster.displayFeatures();
		duster.extraMethod();
		
		Car myCar = new SUV("Bolero", "Diesel", 2200, 6, 11.4f, 120f, "City", false);
		myCar.displayFeatures();
		myCar.accelerate();

		//myCar.extraMethod();
	}

}
