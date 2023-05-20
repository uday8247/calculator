package com.calculator.bdd.model;

import java.util.ArrayList;
import java.util.List;

public class CalculatorImpl implements Calculator{

	@Override
	public int add(String numbers) {
		if(numbers.equals("")) {
			return 0;
		}
		if(numbers.length() == 1) {
			return Integer.parseInt(numbers);
		}
		String numbersUpdated = numbers.replaceAll("(\r\n|\n)", ",");
		String[] numbersArray = numbersUpdated.split(",");
		List<Integer> negativeNumbers = new ArrayList<>();
		int sum = 0;
		for(int i=0; i< numbersArray.length; i++) {
			int a = Integer.parseInt(numbersArray[i]);
			if(a<0) {
				negativeNumbers.add(a);
			} else {
				sum += a ;
			}
		}
		if(negativeNumbers.size() > 0) {
			System.out.println("negatives not allowed " + negativeNumbers);
			throw new RuntimeException("negatives not allowed - " + negativeNumbers);
		}
		return sum;
	}
}
