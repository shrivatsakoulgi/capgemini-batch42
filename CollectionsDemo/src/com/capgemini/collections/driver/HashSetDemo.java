package com.capgemini.collections.driver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Hello");
		hs.add("abcd");
		hs.add("Hi");
		hs.add("Capgemini");
		hs.add("Hi");
		hs.add(null);	// One null object allowed
		hs.add(null);
		System.out.println(hs);
		
		for(String str:hs){
			System.out.print(str+" ");
		}		
		hs.remove("Hi");
		System.out.println("\n"+hs);
		
		System.out.println("Using Iterator...");
		Iterator<String> strItr = hs.iterator();
		while(strItr.hasNext()){
			System.out.print(strItr.next()+" ");
		}
		// Removing all duplicates in ArrayList by creating a HashSet
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(40);
		intList.add(100);
		intList.add(10);
		intList.add(20);
		System.out.println("\nArray List:"+intList);
		
		HashSet<Integer> intHs = new HashSet<Integer>(intList);
		System.out.println("Hash Set of Integers:"+intHs);

	}

}
