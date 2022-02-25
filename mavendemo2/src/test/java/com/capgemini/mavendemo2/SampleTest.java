package com.capgemini.mavendemo2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
	
	@Test
	public void addTest() {
		Sample sample = new Sample();
		assertEquals(4, sample.add(3, 1));
	}

}
