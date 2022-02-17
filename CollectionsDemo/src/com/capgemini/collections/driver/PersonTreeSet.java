package com.capgemini.collections.driver;

import java.util.TreeSet;

import com.capgemini.collections.model.Person;
import com.capgemini.collections.model.PersonSortByNameComparator;

public class PersonTreeSet {

	public static void main(String[] args) {
		
		Person p1 = new Person(123412341234L, 
				"Amar", "Bengaluru",560001 );
		Person p2 = new Person(543476341234L,
				"Akbar", "Delhi",230001 );
		Person p3 = new Person(111412781234L,
				"Anthony", "Mumbai",430001 );
		
		TreeSet<Person> personTreeSet = 
				new TreeSet<Person>();
		personTreeSet.add(p1);
		personTreeSet.add(p2);
		personTreeSet.add(p3);
		
		System.out.println("Person Info:");
		for(Person p:personTreeSet){
			System.out.println(p);
		}
		System.out.println("\n--- Tree created based on Person Name---\n");
		
		
		TreeSet<Person> personTreeByName = new TreeSet<Person>(new PersonSortByNameComparator());
		Person p4 = new Person(123412341234L, 
				"John", "Bengaluru",560001 );
		Person p5 = new Person(543476341234L,
				"Danerys", "Delhi",230001 );
		Person p6 = new Person(111412781234L,
				"Arya", "Mumbai",430001 );
		
		personTreeByName.addAll(personTreeSet);

		personTreeByName.add(p4);
		personTreeByName.add(p5);
		personTreeByName.add(p6);
		
		for(Person p:personTreeByName){
			System.out.println(p);
		}
		
	}

}
