package com.Class11;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("PLease enter how many elements you want to enter");
		
		int S=scan.nextInt();
		double sum=0;
		double [] n = new double [S];
		System.out.println("enter all double numbers");
		for ( int a=0; a<S; a++) {
			n[a]=scan.nextDouble();
			sum+=n[a];
			
		}
		System.out.println(sum);
		
		
		
		
		
		
			
			
		}
		
	
	}


