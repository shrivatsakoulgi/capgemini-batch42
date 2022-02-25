package com.capgemini.java8.driver;

import java.util.ArrayList;

public class StreamDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> iList = new ArrayList<Integer>();
		iList.add(5);
		iList.add(6);
		iList.add(7);
		iList.add(8);
		iList.add(9);
		iList.add(10);
		System.out.println(iList);
		System.out.println("Odd numbers in List:");
		// Normal
		for(int a:iList) {
			if(a%2==1) {
				System.out.print(a+" ");
			}
		}
		
		System.out.println("\nUsing Streams");
		
		iList.stream().filter(a->(a%2)==1).map(a->(a*a)).forEach(a->System.out.print(a+" "));
		System.out.println("\n"+iList);
	}

}
