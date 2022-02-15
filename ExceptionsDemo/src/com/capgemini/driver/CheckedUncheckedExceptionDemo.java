package com.capgemini.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class CheckedUncheckedExceptionDemo {

	public static void main(String[] args) {

	
		String str=null;
		//System.out.println(str.length());
	
		System.out.println("After exception..");
		
		
		try{
		 FileInputStream input = new FileInputStream("input.txt");
		}catch(FileNotFoundException ex){
			System.out.println(ex);
		}
		finally{
			System.out.println("Inside Finally block of Checked Exception..");
		}

	}

}
