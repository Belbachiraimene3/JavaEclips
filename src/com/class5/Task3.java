package com.class5;

import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter your score");
	
	double grade = scan.nextDouble();
	String score;
	
	if (grade>=90) {
		score ="A";
		
	}else if (grade<=89&&grade>=70) {
		score ="B";
		
	}else if (grade<=69&&grade>=50) {
		score ="C";
		
	}else {
		score ="F";
		
	}
	
	System.out.println("Your grade is "+score);
	
}
}
