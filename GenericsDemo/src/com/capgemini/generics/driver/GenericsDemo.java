package com.capgemini.generics.driver;

import com.capgemini.generics.model.Demo;
import com.capgemini.generics.model.Employee;

public class GenericsDemo {

	public static void main(String[] args) {
		
		Demo <Integer> intDemo = new Demo<Integer>();
		intDemo.setData(10);
		System.out.println("Integer data value: "+intDemo.getData());
		
		Demo <Float> floatDemo = new Demo<Float>();
		floatDemo.setData(3.4f);
		System.out.println("Float data value: "+floatDemo.getData());
		
		Demo<String> strDemo = new Demo<String>();
		strDemo.setData("String data");
		System.out.println("String data value: "+strDemo.getData());
		
		Employee e =  new Employee(1001, "Ram", "Manager", 60000);
		Demo<Employee> empDemo = new Demo<Employee>();
		empDemo.setData(e);
		System.out.println("Employee Data value:\n"+empDemo.getData());

	}

}
