package com.capgemini.driver;
import com.capgemini.entity.Box;


public class BoxDemo {

	public static void main(String[] args) {
		
		Box b1 = new Box("MyBox1",10,20,30);
		
		b1.displayProperties();
		System.out.println("Volume of Box1:"+b1.getVolume());
		System.out.println();
		
		Box b2 = new Box("MyBox2",15,16,17);
		
		//b2.initialize(15, 16, 17);
		b2.displayProperties();
		System.out.println("Volume of Box2:"+b2.getVolume());
		System.out.println();

		System.out.println("Hashcode of b1:"+b1.hashCode());
		System.out.println("Hashcode of b2:"+b2.hashCode());
		Box b3=b1;
		System.out.println("Hashcode of b3:"+b3.hashCode());
		
		System.out.println("Volume of Box1:"+b1.getVolume());
		
		System.out.println("Volume of Box1 after re-initializing b3:"+b1.getVolume());
		
	}

}
