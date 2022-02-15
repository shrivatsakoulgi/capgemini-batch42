package com.capgemini.inheritance.driver;

import com.capgemini.inheritance.entity.Car;
import com.capgemini.inheritance.entity.HatchBack;
import com.capgemini.inheritance.entity.SUV;

public class CarInheritanceDemo {

	public static void main(String[] args) {
		
		HatchBack altroz = new HatchBack("Tata Altroz", "Petrol",
				1200, 5, 16.7f, 85.4f, true, "Harman");
		altroz.displayFeatures();
		
		altroz.accelerate();
		altroz.changeGears(1);
		altroz.changeGears(2);
		altroz.changeGears(3);
		altroz.applyBrake();
		altroz.changeGears(2);
		altroz.changeGears(1);
		altroz.applyBrake();
		altroz.steer();
		altroz.applyBrake();
		altroz.changeGears(0);
		
		if(altroz instanceof Car){
			System.out.println("Altroz is a Car");
			if(altroz instanceof HatchBack){
				System.out.println("Altroz is a HatchBack");
			}
		}
		
		SUV harrier = new SUV("Tata Harrier", "Diesel", 
				2500, 6, 8.9f, 150, "ECO", true);
		harrier.displayFeatures();
		
		harrier.accelerate();
		harrier.setDriveMode("SPORTS");
		harrier.accelerate();
		harrier.setDriveMode("CITY");
		harrier.accelerate();
		harrier.applyBrake();

	}

}
