package com.Class06;

import java.util.Scanner;

public class HwOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please entr your country");
		String country= scan.nextLine();
		String language=null;
		
		switch (country.toLowerCase()) {
		case "algeria":
			language= "arabic";
			break;
		case "spain":
			language= "spanish";
			break;	
		case "france":
			language= "french";
			break;
		case "india":
			language= "indian";
			break;
		case "china":
			language= "chinese";
			break;
		case "turky":
			language= "turkish";
			break;	
		default:	
		System.out.println();
		}
		
		System.out.println("The people from "+country+" speakes "+language);
		
		System.out.println("----------------------- Hw 2 --------------------------------");
		
		System.out.println("Please enter the garade");
		String grade= scan.next();
	
		String explanation;
		
		switch(grade.toLowerCase()) {
		case "a":
			explanation = "Excellent";
			break;
		case "b":
			explanation = "Good";
			break;	
		case "c":
			explanation = "Average";
			break;
		case "d":
			explanation = "Bad";
			break;
		default:
			explanation= "Invalid";
		}
		System.out.println("Your grade is "+grade+" an it is "+explanation);
	}

}
