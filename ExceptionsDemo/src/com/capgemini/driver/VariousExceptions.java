package com.capgemini.driver;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VariousExceptions {

	public static void main(String[] args) {
		
		try{
		String str=null;
		// NullPointerException
		//System.out.println("Length of String is:"+str.length());
		
		//System.out.println("Hello.. after exception");
		// ArithmeticException
			int a=4/0;
		
		//ArrayIndexOutOfBoundsExcpetion
		//int array[]=new int[4];  // 0 1 2 3
		//array[4]=10;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		//InputMismatchException
		int number=scanner.nextInt(); 
		}

		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("ArrayIndex Exception Occured: "+ex);
		}catch(InputMismatchException ex){
			System.out.println("InputMisMatch Exception Occured: "+ex);
		}	
		finally{
			System.out.println("Inside Finally Block...");
		}
		
		System.out.println("After Catch Block..");
		//

	}

}
