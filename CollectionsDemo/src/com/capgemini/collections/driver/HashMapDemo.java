package com.capgemini.collections.driver;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.capgemini.collections.model.Employee;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "John");
		hm.put(2, "Danerys");
		hm.put(3, "Sansa");
		hm.put(4, "Arya");
		System.out.println(hm);
		
		hm.put(null, "Aegon");

		System.out.println(hm);
		for(Integer key:hm.keySet()){
			System.out.println(key+" = "+hm.get(key));
		}
		
		System.out.println("--Using Iterator--");
		
		Iterator<Integer> keys = hm.keySet().iterator();
		while(keys.hasNext()){
			Integer k = keys.next();
			System.out.println(k+" = "+hm.get(k));
		}
		
		// Using map Entry 
		System.out.println("--Using Map Entry--");
		for(Map.Entry<Integer, String> entry:hm.entrySet()){
			System.out.println(entry.getKey()+" = "+entry.getValue());
			
		}
		
		HashMap<Integer,Employee> empHashMap = new HashMap<Integer, Employee>();
		Employee e1 = new Employee(1001, "Ram", "Manager", 60000);
		Employee e2 = new Employee(1002, "Amar", "Sr.Manager", 65000);
		Employee e3 = new Employee(1003, "Sahil", "HR", 50000);
		Employee e4 = new Employee(1004, "Rahul", "Lead", 55000);
		
		empHashMap.put(e1.getEmployeeId(), e1);
		empHashMap.put(e2.getEmployeeId(), e2);
		empHashMap.put(e3.getEmployeeId(), e3);
		empHashMap.put(e4.getEmployeeId(), e4);
		
		//System.out.println(empHashMap);
		for(int empId:empHashMap.keySet()){
			System.out.println(empId+" = "+empHashMap.get(empId));
		}
		
		
	}

}
