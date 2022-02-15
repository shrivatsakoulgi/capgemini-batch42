package com.capgemeni.driver;

import com.capgemini.entity.Bird;
import com.capgemini.entity.Cow;
import com.capgemini.entity.Eagle;
import com.capgemini.entity.Mammal;
import com.capgemini.entity.Pigeon;
import com.capgemini.entity.Tiger;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Cow cow = new Cow();
		cow.eat();
		cow.feed();
		System.out.println();
		
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.feed();
		System.out.println();
		
		System.out.println("--Using Mammal Interface reference---");
		Mammal mammal = new Cow();
		mammal.eat();
		mammal.feed();
		System.out.println();
		
		mammal = new Tiger();
		mammal.eat();
		mammal.feed();
		
		System.out.println("\n---Birds---\n");
		
		Bird bird=new Eagle();
		bird.eat();
		bird.fly();
		System.out.println("Bird refering Eagle: "
				+ "Bird hashCode:"+bird.hashCode());
		
		bird = new Pigeon();
		bird.eat();
		bird.fly();
		System.out.println("Bird refering Pigeon:"
				+ " Bird hashCode:"+bird.hashCode());
		
		
		System.gc(); // Calling Garbage Collector Method
		
		Pigeon pigeon  = new Pigeon();
		pigeon.eat();
		pigeon.fly();
		System.out.println("Hash code: "+
		pigeon.hashCode()+"\n");
		
		Eagle eagle = new Eagle();
		eagle.eat();
		eagle.fly();
		System.out.println("\n Using Bird Reference...");
		
		
		
				
				
				
				
				
		
		
	}
}
