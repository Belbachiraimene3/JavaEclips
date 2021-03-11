package com.class04;

import java.util.Scanner;

public class HMpart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("How log have you been working with us?");
		int v1= scan.nextInt();
		if (v1>=5) {
			System.out.println("How much is you annual salary?");
			int v2= scan.nextInt();
			if (v2>50000) {
				System.out.println("Your bonus is $5000");
			}else {
				System.out.println("Your bonus is $3000");
			}
		}else {
			System.out.println("You are not elegible for the bonus");
		}
		System.out.println("Input the boolean value");
		boolean value1= scan.nextBoolean();
    System.out.println("The value is "+value1);
    
    System.out.println("Input the boolean value");
		boolean value2= scan.nextBoolean();
    System.out.println("The value is "+value2);
		
	}

}
