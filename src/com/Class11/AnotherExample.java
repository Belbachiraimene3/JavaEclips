package com.Class11;

public class AnotherExample {

	public static void main(String[] args) {
		
		int [][] n= {
				{10, 20, 30, 40},
				{90, 80},
				{1, 2, 3, 4, 5, 6, 7},
		};

		for (int r=0; r<n.length; r++) {
			for (int c=0; c<n[r].length; c++) {
				System.out.print(n[r][c]+" ");
			}
			System.out.println();	
		}
		
		System.out.println("--------------------------------");
		
		for(int[] array : n) {
			for (int a : array) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
	}

}
