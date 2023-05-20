package com.calculator.bdd.model;

public class CalculatorImpl implements Calculator{

	@Override
	public int add(String numbers) {
		if(numbers.equals("")) {
			return 0;
		}
		if(numbers.length() == 1) {
			return Integer.parseInt(numbers);
		}
		String[] numbersArray = numbers.split(",");
		int sum = 0;
		for(int i=0; i< numbersArray.length; i++) {
			sum += Integer.parseInt(numbersArray[i]);
		}
		return sum;
	}
}
