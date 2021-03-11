package com.class5;

import java.util.Scanner;

public class LogicalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = scan.nextInt();
		if (num<=0) {
			System.out.println("Number is 0 or nigative");
		}else if (num>=1&&num<=10) {
			System.out.println("Small number");
		}else if (num>=11&&num<=100) {
			System.out.println("Medium number");
		}else if (num>=101&&num<=1000) {
			System.out.println("Large number");
		}else if (num>=1001&&num<=10000) {
			System.out.println("X large number");
		}else {
			System.out.println(num+" Is Out of range");
		}
		
	
		System.out.println("Please enter your height");
		int height = scan.nextInt();
		
		if (height<60) {
			System.out.println("You are short");
		}else if (height>=60&&height<=72) {
			System.out.println("You are medium");
		}else if (height>72) {
			System.out.println("You are short");
	
		}else {
			System.out.println(num+" Is Out of range");
		}
		
		System.out.println("Please enter your day");
		int day = scan.nextInt();
		
		if (day>=1&&day<=5) {
			System.out.println("weekday");
		}else if (day>=6&&day<=7) {
			System.out.println("Its the weekend");
	
		}else {
			System.out.println("Invalid day");
		}
		
		
		
	}

}
