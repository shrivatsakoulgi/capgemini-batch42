package com.capgemeni.driver;

import com.capgemini.entity.Rectangle;
import com.capgemini.entity.Shape;
import com.capgemini.entity.Triangle;

public class AbstsractDemo {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(10, 20);
		Rectangle rectangle =  new Rectangle(20, 30);
		
		triangle.area();
		System.out.println("Triangle no. of sides:"+triangle.getNumberOfSides());
		rectangle.area();
		
		System.out.println("Rectangle no. of sides:"+rectangle.getNumberOfSides());
		System.out.println();
		System.out.println("-- Using Shape reference ---");
		Shape shape = new Triangle(5,6);
		shape.area();
		
		shape = new Rectangle(5, 6);
		shape.area();
		System.out.println(rectangle);
		System.out.println(triangle);
		//rectangle.display();

	}

}
