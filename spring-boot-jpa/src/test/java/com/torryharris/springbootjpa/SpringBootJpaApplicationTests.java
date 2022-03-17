package com.torryharris.springbootjpa;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.capgemini.springbootjpa.controller.EmployeeJpaController;
import com.capgemini.springbootjpa.model.Employee;
import com.capgemini.springbootjpa.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.capgemini.springbootjpa.SpringBootJpaApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class SpringBootJpaApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private EmployeeService employeeService;

	@Before
	public void setup() {
		EmployeeJpaController controller = new EmployeeJpaController();
		controller.setEmployeeService(employeeService);
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}

	Employee employee = new Employee(1001, "John", "Manager", 80000);
	String exampleEmployeeJson = "{\"empId\":\"1001\",\"name\":\"John\",\"designation\":\"Manager\",\"salary\":\"80000\"}";

	@Test
	public void getEmployeeByIdTest() throws Exception {
	
		  Mockito.when(employeeService.getEmployeeById(Mockito.anyInt())).thenReturn(
		  employee);
		  
		  RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
		  "/jpa/employee/1001").accept( MediaType.APPLICATION_JSON);
		  System.out.println("Mock mvc: "+mockMvc);
		  MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		  
		  System.out.println(result.getResponse()); 
		  String expected =
		  "{empId:1001,name:John,designation:Manager,salary:80000}";
		  
		  JSONAssert.assertEquals(expected, result.getResponse() .getContentAsString(),
		  false);
		 
		 
	}

}
