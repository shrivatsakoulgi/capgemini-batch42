package com.capgemini.collections.driver;

import java.util.ArrayList;

import com.capgemini.collections.model.Employee;
import com.capgemini.collections.model.EmployeeSortByNameComparator;

public class EmployeeArrayList {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1001, "Ram", "Manager", 60000);
		Employee e2 = new Employee(1002, "Sita", "Lead", 45000);
		Employee e3 = new Employee(1003, "Shyam", "Architect", 65000);
		Employee e4 = new Employee(1004, "Radha", "Sr. Architect", 80000);
		Employee e5 = new Employee(1005, "Laxman", "Tech Lead", 50000);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(e4);
		empList.add(e2);
		empList.add(e3);
		empList.add(e1);
		//System.out.println(empList);
		
	/*	for(Employee e:empList){
			System.out.println(e);
		}
		*/
		empList.add(2, e5);
		System.out.println();
		
		/*//Updating the name of Employee  from Laxman -> Lakhan
		int index=0;
		for(Employee e:empList){
			if(e.getName().equals("Laxman")){
				index=empList.indexOf(e);
			}
		}
		
		Employee temp = empList.get(index);
		temp.setName("Lakhan");
		empList.set(index, temp);*/
		
		for(Employee e:empList){
			System.out.println(e);
		}
		
		// null -> Default sorting based on Comparable
		empList.sort(null);  // Sorting the Employee by Employee Id
		System.out.println("\n--- After Sorting based "
				+ "on Emp Id---\n");
		for(Employee e:empList){
			System.out.println(e);
		}
		System.out.println();
		
		// pass the object of Comparator if sort by other criteria is required
		empList.sort(new EmployeeSortByNameComparator());  // Sorting the Employees by Name
		System.out.println("\n--- After Sorting based "
				+ "on Name---\n");
		for(Employee e:empList){
			System.out.println(e);
		}		
	}

}
