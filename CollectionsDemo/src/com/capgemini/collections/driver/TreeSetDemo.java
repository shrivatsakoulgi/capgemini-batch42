package com.capgemini.collections.driver;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> intTreeSet = new TreeSet<Integer>();

		intTreeSet.add(10);
		intTreeSet.add(5);
		intTreeSet.add(2);
		intTreeSet.add(8);
		intTreeSet.add(12);
		intTreeSet.add(15);
		intTreeSet.add(4);
		intTreeSet.add(10);
		System.out.println(intTreeSet);
		
		TreeSet<String> strTreeSet = new TreeSet<String>();
		strTreeSet.add("Hello");
		strTreeSet.add("Hi");
		strTreeSet.add("ABCD");
		strTreeSet.add("Capgemini");
		strTreeSet.add("Training");
		strTreeSet.add("Java");
		System.out.println(strTreeSet);

	}

}
