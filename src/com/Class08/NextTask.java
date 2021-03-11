package com.Class08;

import java.util.Scanner;

public class NextTask {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the item name ");
		String item=scan.next();
		System.out.println("Please enter the price");
		int price=scan.nextInt();
		int money;
		int result;
		int sum=0;
		System.out.println("Please pay your balance");
		do {
			
			money=scan.nextInt();
			sum+=money;
			if(money<price) {
				
				result=price-sum;
				System.out.println("please add "+result);	
				
				
				
			} else{
				
				result=sum-price;
				System.out.println("Here is your change "+result);
				break;
			}/*else {
				System.out.println("You enetered the rigtht amount");
				
			}*/
			
			
		}while (sum!= price); {
			System.out.println("Thanks for your shoping");
		}
		
	}

}
