package com.torryharris.springbootjpa;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.capgemini.springbootjpa.controller.EmployeeJpaController;
import com.capgemini.springbootjpa.model.Employee;
import com.capgemini.springbootjpa.service.EmployeeService;


@SpringBootTest(classes = com.capgemini.springbootjpa.SpringBootJpaApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeJpaControllerTest extends SpringBootJpaApplicationTests{
	
	
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@MockBean
	private EmployeeService employeeService;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	Employee employee = new Employee(1001, "John", "Manager", 80000);
	String exampleEmployeeJson = "{\"empId\":\"1001\",\"name\":\"John\",\"designation\":\"Manager\",\"salary\":\"80000\"}";

	@Test
	public void getEmployeeByIdTest() throws Exception {
		
		mockMvc.perform(get("/jpa/employee/1001")).andExpect(status().isOk())
		.andExpect(content().contentType("application/json;charset=UTF-8"))
		.andExpect(jsonPath("$.empId").value(employee.getEmpId())).andExpect(jsonPath("$.name").value(employee.getName()))
		.andExpect(jsonPath("$.designation").value(employee.getDesignation())).andExpect(jsonPath("$.salary").value(employee.getSalary()));
		/*
		 * Mockito.when(employeeService.getEmployeeById(Mockito.anyInt())).thenReturn(
		 * employee);
		 * 
		 * RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
		 * "/jpa/employee/1001").accept( MediaType.APPLICATION_JSON);
		 * 
		 * MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		 * 
		 * System.out.println(result.getResponse()); String expected =
		 * "{empId:1001,name:John,designation:Manager,salary:80000}";
		 * 
		 * // {"id":"Course1","name":"Spring",
		 * "description":"10 Steps, 25 Examples and 10K Students","steps":["Learn Maven"
		 * ,"Import Project","First Example","Second Example"]}
		 * 
		 * JSONAssert.assertEquals(expected, result.getResponse() .getContentAsString(),
		 * false);
		 */
	}
	
} 
