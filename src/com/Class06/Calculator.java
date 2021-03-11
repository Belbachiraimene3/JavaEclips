package com.Class06;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please entr 1 for addition, 2 for subtraction, 3 for division, 4 for multiplication ");
		int num =scan.nextInt();
		double num1,num2, result;
		if (num==1) {
			System.out.println("please enter your first number:");
			num1 = scan.nextDouble();
			System.out.println("please enter your first number:");
			num2 = scan.nextDouble();
			result=(num1+num2);
			System.out.println(result);
		
		}else if (num==2) {
			System.out.println("please enter your first number:");
			num1 = scan.nextDouble();
			System.out.println("please enter your first number:");
			num2 = scan.nextDouble();
			result=(num1-num2);
			System.out.println(result);
			
		}else if (num==3) {
			System.out.println("please enter your first number:");
			num1 = scan.nextDouble();
			System.out.println("please enter your first number:");
			num2 = scan.nextDouble();
			result=(num1/num2);
			System.out.println(result);
			
		}else if (num==4) {
			System.out.println("please enter your first number:");
			num1 = scan.nextDouble();
			System.out.println("please enter your first number:");
			num2 = scan.nextDouble();
			result=(num1*num2);
			System.out.println(result);
		
		}else {
			System.out.println("Invalid operator");
		}
	}

}
