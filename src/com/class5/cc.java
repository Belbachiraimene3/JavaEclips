package com.class5;

import java.util.Scanner;

public class cc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2,num3,large;
		String result="Value3";
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter Value number 1");
		num1 = scan.nextInt();
		
		num2 = scan.nextInt();
		
		num3 = scan.nextInt();
		
		if (num1>num2) {
			if (num1>num3) {
				result ="Value 1";
			}
		}else if(num2>num1) {
			if (num2>num3) {
				result ="Value 2";
			}
		
		}
		System.out.println("The largest number is "+result);
		
		
		
	
	}
}
	




