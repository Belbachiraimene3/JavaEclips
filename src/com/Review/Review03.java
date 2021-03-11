package com.Review;

import java.util.Scanner;

public class Review03 {

	public static void main(String[] args) {
		
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Please enter two strings and two numbers");
		
	
		
	  String result=null;
		
	  int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		String word1=scan.next();
		String word2=scan.next();
		
		
		if(word1.equals(word2) && num1==num2 ) {
			result ="AND";
			
		}else if (word1.equals(word2) || num1==num2  ) {
			result ="OR";
			
		}else if (num1!=num2 && !word1.equals(word2)) {
			result ="NONE";
		
		}
		
		System.out.println(result);
		
	}

	

}
