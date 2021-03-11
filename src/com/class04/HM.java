package com.class04;

import java.util.Scanner;


public class HM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("What is the amount of the loan needed");
		
		int loan= scan.nextInt();
		if (loan<=200000) {
			System.out.println("You are approved for the loan");
		}else {
			System.out.println("You are rejected for the loan");
		}
		
		System.out.println("Please provide your age");
		int age=scan.nextInt();
		if (age>=18) {
			System.out.println("We will issue your driver licens");
		}else {
			System.out.println("We offer you to get your learns permit");
		}
		
		System.out.println("Enter the City name");
		
		String name=scan.next();
		
		System.out.println("Enter the temp in Fahrenheit");
		double F=scan.nextDouble();
		double C=(F-32)*(0.5556);
		
		System.out.println("The temp in the city of "+name+" is "+C);
		
		
		
	}

}
