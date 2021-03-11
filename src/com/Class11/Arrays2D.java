package com.Class11;


public class Arrays2D {

	public static void main(String[] args) {
		
		
		int [][] num = new int [3][4];
		num [0] [0]=1;
		num [0] [1]=2;
		num [0] [2]=3;
		num [0] [3]=4;
		
		num [1] [0]=10;
		num [1] [1]=20;
		num [1] [2]=30;
		num [1] [3]=40;
		
		num [2] [0]=100;
		num [2] [1]=200;
		num [2] [2]=300;
		num [2] [3]=400;
		
		System.out.println(num[1][3]);
		
		System.out.println("-----------------------------------------------------");
		
		int[] [] numbers = { 
			
		{11, 22, 33, 44},
		{110, 220, 330, 440},
		{1100, 2200, 3300, 4400},
		
		};
		
		System.out.println(numbers[1][2]);
		
		String [][] name = {
				
				{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"},
				
		};
		System.out.println(name[0][0]+" "+name[1][0]);
		System.out.println(name[0][1]+" "+name[1][1]);
		System.out.println(name[0][2]+" "+name[1][2]);
		System.out.println(name[0][3]+" "+name[1][3]);
	
		System.out.println();
		

	String [][] names = {
			
			{"Aimen","Kawther","Abdou","Fati"},
			{"A","B","C","D","F"},
	
	
};
	System.out.println(names[0][0]+" "+names[1][0]);
	System.out.println(names[0][1]+" "+names[1][1]);
	System.out.println(names[0][2]+" "+names[1][2]);
	System.out.println(names[0][3]+" "+names[1][3]);
	
	
	}	
}	
