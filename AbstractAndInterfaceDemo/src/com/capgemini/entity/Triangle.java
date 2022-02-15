package com.capgemini.entity;

public class Triangle extends Shape{
	
	private int length;
	private int breadth;	
	
	public Triangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		super.setNumberOfSides(3);
	}

	@Override
	public void area(){
		System.out.println("Area of Triangle is:"+(length*breadth)/2);
	}

	@Override
	public String toString() {
		return "Triangle [length=" + length + ", breadth=" + breadth + "]";
	}

	
	
	
	

}
