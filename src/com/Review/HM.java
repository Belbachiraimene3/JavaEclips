package com.Review;

import java.util.Scanner;

public class HM {

	private static final String Sysytem = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter month number");
		int v1= scan.nextInt();
		
		
		if (v1==1){
      System.out.println("January");
		}else if (v1==2) {
			System.out.println("Feburary");
		}else if (v1==3) {
			System.out.println("March");
		}else if (v1==4) {
			System.out.println("April");
		}else if (v1==5) {
			System.out.println("May");
		}else if (v1==6) {
			System.out.println("Jun");
		}else if (v1==7) {
			System.out.println("July");
		}else if (v1==8) {
			System.out.println("August");
		}else if (v1==9) {
			System.out.println("September");
		}else if (v1==10) {
			System.out.println("October");
		}else if (v1==11) {
			System.out.println("November");
		}else if (v1==12) {
			System.out.println("December");
      }else {
    	  System.out.println("Invalid");
      }
        
    
	}

}
