package com.capgemini.fileio.driver;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.capgemini.fileio.model.Employee;

public class DeSerializationDemo {

	public static void main(String[] args) throws IOException, 
	ClassNotFoundException {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();	
		FileInputStream fIn = new
				FileInputStream("employees.txt");
		ObjectInputStream inputStream = 
				new ObjectInputStream(fIn);
		System.out.println("File contents are:\n");
		while(true){			// Infinite Loop
			try{
				// De-Serializing entire ArrayList<Employee>
			Employee e =  (Employee) 
					inputStream.readObject();
			empList.add(e);
			}catch(EOFException e){
				break;
			}
		}
		System.out.println("Employee Contents are:");
		for(Employee e:empList){
			System.out.println(e);
		}
		inputStream.close();
		fIn.close();

	}

}
