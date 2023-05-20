package com.calculator.bdd.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.calculator.bdd.model.Calculator;
import com.calculator.bdd.model.CalculatorImpl;

public class Some {
	
	@Test
	void testSumWithEmptyString() {
		Calculator calculator = new CalculatorImpl();
		int sum = calculator.add("");
		Assertions.assertEquals(0, sum);
	}
	
}
