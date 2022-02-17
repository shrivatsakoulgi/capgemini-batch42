package com.capgemini.collections.driver;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> intList = new LinkedList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		intList.add(50);
		//intList.add(null);
		
		System.out.println(intList);
		
		for(int item:intList){
			System.out.print(item+" ");
		}
		
		System.out.println("\nUsing Iterator...\n");
		ListIterator<Integer> itr = intList.listIterator();		
		while(itr.hasNext()){
			
			int item=itr.next();
			System.out.print(item+" ");
			if(item==10)
				itr.remove();	
		}
		System.out.println("After removing the item...");
		System.out.println(intList);
	}
}
