package com.Class11;

public class GroupTaske {

	public static void main(String[] args) {
		int f1=0;
		int f2=1;
		
		for (int i=1; i<=10; i++) {
			f1=f1+f2;
			f2=f1-f2;
			
			System.out.print(f1+" ");
		}

	}

}
