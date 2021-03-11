package com.Class07;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		
		
		int lucky=17;
		
		
		int num;
		do {
			System.out.println("Please enter your lucky number from 1 to 100 to win price");
			num =scan.nextInt();
			
		}while(num !=lucky);
		
		System.out.println("Congratulations you entered "+num+", you won!!");
	}

}
