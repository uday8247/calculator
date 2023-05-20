package com.calculator.bdd.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.calculator.bdd.model.Calculator;
import com.calculator.bdd.model.CalculatorImpl;

public class CalculatorTest {
	
	@Test
	void testSumWithEmptyString() {
		Calculator calculator = new CalculatorImpl();
		int sum = calculator.add("");
		Assertions.assertEquals(0, sum);
	}
	
	@Test
	void testSumWithOneNumber() {
		Calculator calculator = new CalculatorImpl();
		int sum = calculator.add("1");
		Assertions.assertEquals(1, sum);
	}
	
	@Test
	void testSumWithTwoNumbers() {
		Calculator calculator = new CalculatorImpl();
		int sum = calculator.add("1,2");
		Assertions.assertEquals(3, sum);
	}
	
	
}
