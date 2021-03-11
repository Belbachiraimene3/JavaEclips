package com.Review;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the roll number of the Child");
		String name; 
		int day=scan.nextInt();
		
		
		
		
		switch (day) {
		
		case 1:
			name= "Monday";
			break;
		case 2:
			name= "Tuesday";
			break;
		case 3:
			name= "Wendesdday";
			break;	
		case 4:
			name= "Thursday";
			break;
		case 5:
			name= "Friday";
			break;	
		case 6:
			name= "Saturday";
			break;	
		case 7:
			name= "Sunday";
			break;	
		default:
			name= "Invalid";
			break;
	
		
		}
		
		System.out.println(name);
	
	}
}
