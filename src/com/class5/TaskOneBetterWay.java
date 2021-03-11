package com.class5;

import java.util.Scanner;


public class TaskOneBetterWay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your sales");
		
		double sales = scan.nextDouble();
		double comission;
		
		
		if (sales<10) {
			comission = 0;
			
		}else if (sales>=10 && sales<=100) {
			comission =sales*0.1;
		
		}else if (sales>100 && sales<500) {
			comission =sales*0.2;
		
		}else if (sales>500 && sales<1000) {
			comission =sales*0.3;
		
		}else {
			comission =sales*0.5;
		
		}
		System.out.println("Your daily commision is "+comission);
		
		if (comission>500) {
			System.out.println("You are an amazing saler");
		}
	}
}
