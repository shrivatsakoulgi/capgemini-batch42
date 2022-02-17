package com.capgemini.collections.driver;

import java.util.TreeMap;

import com.capgemini.collections.model.Employee;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<String,Double> scores = new TreeMap<String, Double>();
		
		scores.put("Shyam", 7.8);
		scores.put("John", 8.9);
		scores.put("Ram", 9.3);
		//scores.put(null, 4.5);
		
		System.out.println(scores);
		
		for(String key:scores.keySet()){
			System.out.println(key+" = "+scores.get(key));
		}
		
		Employee e1 = new Employee(1001, "Ram", "Manager", 60000);
		Employee e2 = new Employee(1002, "Raghav", "Manager", 75000);
		Employee e3 = new Employee(1003, "Shyam", "Sr. Manager", 80000);
		Employee e4 = new Employee(1004, "Sita", "Lead", 70000);
		
		TreeMap<Integer,Employee> employeeTreeMap = new TreeMap<Integer, Employee>();
		employeeTreeMap.put(e3.getEmployeeId(), e3);
		employeeTreeMap.put(e4.getEmployeeId(), e4);
		employeeTreeMap.put(e1.getEmployeeId(), e1);
		employeeTreeMap.put(e2.getEmployeeId(), e2);
		
		for(Integer key:employeeTreeMap.keySet()){
			System.out.println(key+" = "+employeeTreeMap.get(key));
		}
		
		

	}

}
