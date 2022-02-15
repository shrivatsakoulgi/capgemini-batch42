package com.capgemini.entity;

public class Box {
	private String name; 
	private int length;
	private int width;
	private int height;
	
	// right click-> source -> generate constructor using fields -> generate
	
	public Box() {
	}

	public Box(String name, int length, int width, int height) {
		this.name = name;
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public void displayProperties(){
		System.out.println("Box properties:");
		System.out.println("Name:"+name);
		System.out.println("Length:"+length);
		System.out.println("Width:"+width);
		System.out.println("Height:"+height);
		System.out.println();
	}
	
	public int getVolume(){
		return length*width*height;
	}

}
