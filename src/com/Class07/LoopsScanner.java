package com.Class07;

import java.util.Scanner;

public class LoopsScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int q=0;
		
		while(q<=5) {
			
		System.out.println("Enter your name please");
		String name = scan.next();
		System.out.println("Hello "+name );
		
		q++;
		}
	}

}
