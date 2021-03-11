package com.class04;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	
		Scanner  scan = new Scanner(System.in);
		System.out.println("Please enter any text");
		
		
		String text =scan.nextLine();
		System.out.println("Text I entered is "+text);
		
		System.out.println("Please enter your name");
		
		String name =scan.next();
		System.out.println("Nice to meet you "+name);
	
		
		System.out.println("Please enter your age");
		
		int age =scan.nextInt();
		System.out.println("You born in "+(age-2021));
		

	}

}
