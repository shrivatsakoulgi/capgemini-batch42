package com.capgemeni.driver;

import com.capgemini.entity.Bat;
import com.capgemini.entity.Bird;
import com.capgemini.entity.Mammal;

public class BatDemo {

	public static void main(String[] args) {

		Bat bat = new Bat();
		bat.eat();
		bat.feed();
		bat.fly();
		
		Mammal b = new Bat();
		b.eat();
		b.feed();
		//b.fly(); -> Not possible.
		
		Bird bird = new Bat();
		bird.eat();
		bird.fly();
		//bird.feed(); -> Not Possible

	}

}
