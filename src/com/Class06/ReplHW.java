package com.Class06;

import java.util.Scanner;



public class ReplHW {
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	System.out.println("Please enter your mark");
	int mark= scan.nextInt();
	char grade=0;
	
	if (mark>=1&&mark<25) {
		grade='F';
	}else if (mark>=25&&mark<45) {
		grade='E';
		
	}else if (mark>=45&&mark<50) {
		grade='D';
		
	}else if (mark>=50&&mark<60) {
		grade='C';
		
	}else if (mark>=60&&mark<80) {
		grade='B';
		
	}else if (mark>=80&&mark<=100) {
		grade='A';
	}else {
		System.out.println("Please enter valid mark");
	}
	
	System.out.println("Your grade is "+grade);
}
}

