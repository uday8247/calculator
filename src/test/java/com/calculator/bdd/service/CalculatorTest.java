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
	
	@Test
	void testSumWithMoreThanTwoNumbersSeperatedByNewLine() {
		int sum = calculator.add("1\n2,3");
		Assertions.assertEquals(6, sum);
	}
	
	@Test()
	void testSumWithMoreThanTwoNumbersWithNegativeNumbers() {
		 Assertions.assertThrows(RuntimeException.class, () -> calculator.add("1,-2,-3"));
	}
	
	@Test
	void testSumWithDelimiters() {
		int sum = calculator.add("//;\n1;2");
		Assertions.assertEquals(3, sum);
	}
	
}
