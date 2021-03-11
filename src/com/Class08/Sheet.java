package com.Class08;

import java.util.Scanner;





public class Sheet {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Plese enter your number");
		int x=scan.nextInt();
		
		for(int i=x; i>=0; i--) {
			if(i==x) {
				continue;
			}
			System.out.print(i+" ");
		}
		}
		
	}


