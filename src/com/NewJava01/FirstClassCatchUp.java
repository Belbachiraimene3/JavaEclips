package com.NewJava01;

import java.util.Scanner;

public class FirstClassCatchUp {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int [] input = {5,4,8};
		
int smalest = input[0];
int largest = input[0];

for (int i=0; i<input.length; i++) {
	if (input[i]<smalest) smalest=input[i];
	
	if(input[i]>largest) largest=input[i];
	
}

System.out.println(largest);

	}

}
