package com.Class11;

public class GroupHW {

	public static void main(String[] args) {
		
		int [][] numbers = {
				{1, 2, 3, 4, },
				{30, 23 ,55, 60},
				{46, 50, 37, 89},
		};
		int sum=0;
		int even=0;
		int odd=0;
		for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				if(numbers[i][j]%2==0) {
					even+=numbers[i][j];
				
				}else if(numbers[i][j]%2!=0){
					odd+=numbers[i][j];
				}
				
			}
			}
			System.out.println(even);
			System.out.println(odd);
			System.out.println(even+odd);
		}
	
	}


