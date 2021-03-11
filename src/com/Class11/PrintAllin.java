package com.Class11;

public class PrintAllin {

	public static void main(String[] args) {
		
		String [][] usa = {
				
				{"Alexandria","Oakton", "Arlington", "Virginia Beach", "Fairfax"},
				{"Phily","Strassburg", "Pittsburgh"},
				{"Bosotn","Quincy", "Springfield", "Burlington"},
				{"LA","Long Beach", "San Francisco", "Vgas", "Santa barbara"},
				{"Miami","Orlando", "Tampa", "Tallehass"},
				
				
				
		};
		System.out.println(usa.length);
		System.out.println(usa[0].length);
		System.out.println(usa[1].length);
		System.out.println(usa[2].length);
		System.out.println(usa[3].length);
		System.out.println(usa[4].length);
		
		for (int r=0; r<usa.length; r++) {
			for (int c=0; c<usa[r].length; c++) {
				System.out.print(usa[r][c]+", ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------");
		
		for(String[] cities:usa) {
			for(String name:cities) {
				System.out.print(name+" ");
			}
			System.out.println();
		}
	}
	

}
