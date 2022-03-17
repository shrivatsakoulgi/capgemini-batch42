package com.capgemini.springbootjpa.service;

import java.util.List;
import com.capgemini.springbootjpa.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int empId);
	void addEmployee(Employee employee);
	void deleteEmployee(int empId);
	void updateEmployee(Employee employee, int empId);
	
}
