package com.class04;

import java.util.Scanner;

public class HM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		String input = scan.nextLine();
		
		if (input.equals("yes")) {
			System.out.println("What is the balance on your caed?");
			int v1 =scan.nextInt();
			if (v1>1000) {
				System.out.println("Please pay off your debt immediately");
			}else {
				System.out.println("You can spend more");
			}
		}else if (input.equals("no")){
			System.out.println("Would like to apply for a credit card");
		}else {
			System.out.println("Invalid answer");
		}
	}

}
