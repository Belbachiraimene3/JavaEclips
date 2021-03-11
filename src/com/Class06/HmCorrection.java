package com.Class06;

import java.util.Scanner;

public class HmCorrection {
public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);
	
	System.out.println("What is the time of the day?");
	double time = scan.nextDouble();
	String day="Invalid";
	
	if (time>=1 && time<=11) {
			day = "Morning";
	}else if  (time>=12 && time<=13) {
			day = "Noon";
	}else if  (time>=14 && time<=17) {
			day = "Afternoon";
	}else if  (time>=18 && time<=21) {
			day = "evening";
	}else if  (time>=22 && time<=24) {
			day = "Night";

		}
	
	System.out.println("Time of the day is "+day);
	
	
	double num1,num2,num3,result;
	
	System.out.println("Enter Value number 1");
	num1 = scan.nextInt();
	num2 = scan.nextInt();
	num3 = scan.nextInt();
	
	if(num1==num2 && num2==num3) {
		System.out.println("Number are equal");
	}else {
		if (num1>num2) {
			if (num1>num3) {
				result =num1;
			}else {
				result =num3;
			}
		}else {
			if(num2>num3) {
				result =num2;
			}else {
				result =num3;
			}
		}
			
		System.out.println("The largest number among "+num1+", "+num2+", "+num3+", is "+result);
	}
	
	
	
}
}
