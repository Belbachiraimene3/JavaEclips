package com.Class08;

public class BreakConti {

	public static void main(String[] args) {
		
		//Please print all the number except 5 and 6

		
			for (int i=1; i<=10; i++) {
				if (i==5 || i==6) {
					continue;
				}
				System.out.print(i+", ");
			}
			
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
				
			for (int i=1; i<=40; i++) {
				if (i%4==0) {
					continue;
				}
				System.out.print(i+", ");
			}
			
	}

}
