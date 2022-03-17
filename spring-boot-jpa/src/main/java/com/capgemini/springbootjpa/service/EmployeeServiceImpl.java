package com.capgemini.springbootjpa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springbootjpa.exception.EmployeeNotFoundException;
import com.capgemini.springbootjpa.model.Employee;
import com.capgemini.springbootjpa.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {

		ArrayList<Employee> empList = new ArrayList<>();
		for(Employee emp:employeeRepository.findAll()) {
			empList.add(emp);
		}
		
		return empList;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeNotFoundException{
		Optional<Employee> employee = employeeRepository.findById(empId);
		if(!employee.isPresent()) {
			throw new EmployeeNotFoundException();
		}
		return employee.get();
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
		System.out.println(employee);
		
		
	}

	@Override
	public void deleteEmployee(int empId) throws EmployeeNotFoundException {
		
		Optional<Employee> employee = employeeRepository.findById(empId);
		if(!employee.isPresent()) {
			throw new EmployeeNotFoundException();
		}else {
		employeeRepository.deleteById(empId);
		}
	}

	@Override
	public void updateEmployee(Employee employee, int empId) throws EmployeeNotFoundException {
		
		deleteEmployee(empId);
		employeeRepository.save(employee);
		
		
	}

}
