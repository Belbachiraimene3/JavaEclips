package com.Class08;

import java.util.Scanner;

public class Loooooops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+", ");
		}
		System.out.println();
		System.out.println("Please apply for a cridet card");
		//String answer=scan.next();
		
	}

}
