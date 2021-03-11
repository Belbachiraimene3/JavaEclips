package com.Class09;

public class MoreLoops {

	public static void main(String[] args) {
	
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				if (i==0 || i==3 || j==0 || j==3) {
					System.out.print("$");
				}else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	
		for (int i=8; i>1; i--) {
			for (int j=1; j<i; j++) {
				
				System.out.print(j+" ");
				
			}
			
			System.out.println();
			
			}
		
		
		
		for (int i=2; i<=8; i++) {
			
			if(i==2) {
				continue;
			}
			for (int j=1; j<i; j++) {
				
				System.out.print(j+" ");
				
			}
			System.out.println();
			}
		

		
		
		

		

	}

}
