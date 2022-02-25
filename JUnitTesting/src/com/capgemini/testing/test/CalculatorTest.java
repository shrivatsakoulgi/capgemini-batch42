package com.capgemini.testing.test;
import org.junit.Assert;
import org.junit.Test;
import com.capgemini.testing.model.Calculator;
public class CalculatorTest {
	
	@Test
	public void addTest(){
		Calculator cal = new Calculator();
		Assert.assertEquals(7, cal.add(3, 4));
	}
	
	@Test
	public void subTest(){
		Calculator cal = new Calculator();
		Assert.assertEquals(-1, cal.sub(3, 4));
	}
	
	@Test
	public void mulTest(){
		Calculator cal = new Calculator();
		Assert.assertEquals(10, cal.multiply(3, 4));
	}
	
	@Test
	public void divTest(){
		Calculator cal = new Calculator();
		Assert.assertEquals(0, cal.div(3, 4));
	}
}
