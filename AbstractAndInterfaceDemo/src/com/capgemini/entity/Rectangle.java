package com.capgemini.entity;

public class Rectangle extends Shape {

	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		super.setNumberOfSides(4);
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle is:"+(length*breadth));

	}
	
	protected void display(){
		System.out.println("Length:"+length);
		System.out.println("Breadth:"+breadth);
	}
	
	public String toString(){
		return "Rectangle Properties -> Length : "
	 +length+" Breadth: "+breadth;
	}

}
