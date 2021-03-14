package com.NewJava02;

public class CalculatorTester {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(10,12));
		double result=calculator.sub(12.5, 2.5);
		System.out.println(result);
	}

}
