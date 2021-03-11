package com.class04;

import java.util.Scanner;

public class NewDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("Provide the first input");
		
		int N1= scan.nextInt();
		
		System.out.println("Provide the secound number");
		
		int N2= scan.nextInt();
		
		if(N1>N2) {
			System.out.println(N1+" is larger than "+N2);
		}else if (N1<N2) {
			System.out.println(N2+" is larger than "+N1);
		}else {
			System.out.println(N1+" is equals to "+N2);
			
		}
				
	}

}
