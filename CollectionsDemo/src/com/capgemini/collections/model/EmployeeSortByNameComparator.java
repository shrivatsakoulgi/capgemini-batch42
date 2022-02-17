package com.capgemini.collections.model;

import java.util.Comparator;

public class EmployeeSortByNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {		
		return (e1.getName().compareTo(e2.getName()));
	}
}
