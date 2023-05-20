package com.calculator.bdd.model;

public class CalculatorImpl implements Calculator{

	@Override
	public int add(String numbers) {
		if(numbers.length() == 1) {
			return Integer.parseInt(numbers);
		}
		return 0;
	}
}
