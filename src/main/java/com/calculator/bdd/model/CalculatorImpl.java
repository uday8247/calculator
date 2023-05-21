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
		else{
			String delimiter = ",";
        if (numbers.matches("//(.*)\n(.*)")) {
            delimiter = Character.toString(numbers.charAt(2));
            numbers = numbers.substring(4);
        }

        String[] numList = splitNumbers(numbers, delimiter + "|\n");
        return sum(numList);
	}
	}
		private int sum(String[] numbersArray) {
		List<Integer> negativeNumbers = new ArrayList<>();
		int total = 0;
		for(int i=0; i< numbersArray.length; i++) {
			int a = Integer.parseInt(numbersArray[i]);
			if(a<0) {
				negativeNumbers.add(a);
			} else {
				total += a ;
			}
		}
		if(negativeNumbers.size() > 0) {
			System.out.println("negatives not allowed " + negativeNumbers);
			throw new RuntimeException("negatives not allowed - " + negativeNumbers);
		}
		return total;
	}

	private String[] splitNumbers(String numbers, String divider) {
		return numbers.split(divider);
	}
}
