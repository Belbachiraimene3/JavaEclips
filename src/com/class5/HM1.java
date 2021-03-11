package com.class5;

import java.util.Scanner;

public class HM1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your Month");
		
		String month =scan.nextLine();
		String Season = null;
		
		
		if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			Season = "Spring";
			
		}else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			Season = "Summer";
			
		}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			Season = "Autumn";
			
		}else if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("Febuary")) {
			Season = "Winter";
			
		}else {
			System.out.println("Invalid month");
		}
		
		
		System.out.println("You were born in "+Season+" season");
		
		
	}
}
