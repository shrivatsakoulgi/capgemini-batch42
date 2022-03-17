package com.capgemini.springbootjpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springbootjpa.exception.EmployeeNotFoundException;
import com.capgemini.springbootjpa.model.Employee;
import com.capgemini.springbootjpa.repository.EmployeeRepository;
import com.capgemini.springbootjpa.service.EmployeeService;

@RestController
public class EmployeeJpaController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/jpa/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/jpa/employee/{empId}")
	public Employee getEmployeeById(@PathVariable int empId)  {
		Employee employee = employeeService.getEmployeeById(empId);
		return employee;
	}
	
	@PostMapping("/jpa/add_employee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.CACHE_CONTROL, "no-cache");
		employeeService.addEmployee(employee);
		return ResponseEntity.ok().headers(headers).body("SUCCESS..Employee Inserted with Id:"+employee.getEmpId());
}
	
	@DeleteMapping("/jpa/delete_employee/{empId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int empId) {
		employeeService.deleteEmployee(empId);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.CACHE_CONTROL, "no-cache");
		return ResponseEntity.ok().headers(headers).body("SUCCESS..Employee Deleted");
	}
	
	@PutMapping("/jpa/update_employee/{empId}")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee,
			@PathVariable int empId) {
		
		employeeService.updateEmployee(employee, empId);
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.CACHE_CONTROL, "no-cache");
		return ResponseEntity.ok().headers(headers).body("SUCCESS..Employee Updated");
		
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	
	
	
	
	
	
	
}
