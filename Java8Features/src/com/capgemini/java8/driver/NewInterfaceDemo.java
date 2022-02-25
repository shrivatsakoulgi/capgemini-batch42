package com.capgemini.java8.driver;

import com.capgemini.java8.model.NewInterface;
import com.capgemini.java8.model.NewInterfaceImpl;

public class NewInterfaceDemo {

	public static void main(String[] args) {
		
		NewInterfaceImpl newInterface = new NewInterfaceImpl();
		newInterface.display();
		newInterface.defaultMethod();
		
		NewInterface.staticPrintSomething();

	}

}
