package com.Class08;

import java.util.Scanner;

public class TaskLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first numbe you will start the range and the last");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int sum=0;
		int odd=0;
				
		for (int i=num1; i<=num2; i++) {
			if (i%2==0) {
				sum+=i;
				
			}else {
				odd+=i;
			}
		}for (int i=num1; i>=num2; i--) {
			if (i%2==0) {
				sum+=i;
				
			}else {
				odd+=i;
			}
		}
		
		
		System.out.println(sum+odd);
		
	}

}
