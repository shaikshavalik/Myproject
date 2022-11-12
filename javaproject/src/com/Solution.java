package com;

import org.junit.Test;

public class Solution {
	
	@Test
	
	public void mysimpletest() {
		
		
		Calculator calc = new Calculator();
		
		
		int sum = calc.sum(20, 20);
		int multiply = calc.multiply(10, 20);
		int division = calc.division(10, 2);
		int subtraction = calc.subtract(10, 20);
		
		System.out.println("sum is " + sum);
		System.out.println("multiply is " + multiply);
		System.out.println("subtraction is " + subtraction);
		System.out.println("Divide is " + division);
		
		
	}

}
