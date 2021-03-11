package com.Class08;

import java.util.Scanner;

public class PracticeFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		int num;
		do {
			System.out.println("Please pay 3 dolar for the drink");
			num = scan.nextInt();
			if(num<3) {
				System.out.println("please give more money");
			}else {
				System.out.println("please give less money");
			}
		}while(num!=3);{
			System.out.println("Here is your drink");
		}
		
	}

}
