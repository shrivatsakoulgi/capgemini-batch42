package com.capgemini.collections.driver;

import java.util.HashSet;

import com.capgemini.collections.model.Employee;

public class EmployeeHashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Employee> empHashSet = new HashSet<Employee>();
		Employee e1 = new Employee(1001, "Ram", "Manager", 60000);
		Employee e2 = new Employee(1001, "Raghav", "Manager", 60000);
		Employee e3 = new Employee(1002, "Shyam", "Sr. Manager", 80000);
		System.out.println("e1 hashcode:"+e1.hashCode());
		System.out.println("e2 hashcode:"+e2.hashCode());
		empHashSet.add(e1);
		empHashSet.add(e2);
		empHashSet.add(e3);
		
		for(Employee emp:empHashSet){
			System.out.println(emp);
		}
	}

}
