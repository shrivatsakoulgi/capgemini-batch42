package com.capgemini.testing.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)		// Indicates this is a Suite class

// List of Test classes to be run together
@Suite.SuiteClasses({CalculatorTest.class,StringUtilityTest.class})

public class TestSuite {

}
