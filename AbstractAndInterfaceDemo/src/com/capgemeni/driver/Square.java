package com.capgemeni.driver;

import com.capgemini.entity.Rectangle;

public class Square extends Rectangle {

	public Square(int length, int breadth) {
		super(length, length);
	}
	
	public void displaySquare(){
		super.display();
	}

}
