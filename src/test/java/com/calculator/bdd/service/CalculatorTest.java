package com.calculator.bdd.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.calculator.bdd.model.Calculator;
import com.calculator.bdd.model.CalculatorImpl;

class CalculatorTest {
	
	private Calculator calculator;
	
	@BeforeEach
	void run() {
		calculator = new CalculatorImpl();
	}
	
	@Test
	void testSumWithEmptyString() {
		int sum = calculator.add("");
		Assertions.assertEquals(0, sum);
	}
	
	@Test
	void testSumWithOneNumber() {
		int sum = calculator.add("1");
		Assertions.assertEquals(1, sum);
	}
	
	@Test
	void testSumWithTwoNumbers() {
		int sum = calculator.add("1,2");
		Assertions.assertEquals(3, sum);
	}
	
	@Test
	void testSumWithMoreThanTwoNumbers() {
		int sum = calculator.add("1,2,3,4,5");
		Assertions.assertEquals(15, sum);
	}
	
}
