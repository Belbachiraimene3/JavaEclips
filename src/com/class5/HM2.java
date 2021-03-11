package com.class5;

import java.util.Scanner;

public class HM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2,num3;
		String result;
		Scanner scan =new Scanner(System.in);
		
		System.err.println("Enter Value number 1");
		num1 = scan.nextDouble();
		System.err.println("Enter Value number 2");
		num2 = scan.nextDouble();
		System.err.println("Enter Value number 3");
		num3 = scan.nextDouble();
		
		if (num1>num2&&num1>num3) {
			result ="Value 1";
			
		}else if(num2>num1&&num2>num3) {
			result ="Value 2";
			
		}else {
			result ="Value 3";
			
		}
		
		System.out.println("The largest number is "+result);
		
		
		
	}
	
	
	

}
