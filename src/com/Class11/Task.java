package com.Class11;

public class Task {

	public static void main(String[] args) {
		int[][] numbers = {
				{ 17, 22, 36, 49 },
				{ 99, 83, 78, 55 },
				{ 1, 2, 3, 4 }
		};
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				if (numbers[row][col] % 2 == 0) {
					System.out.println(numbers[row][col]);
				} else {
					
				}
			}
		}

	}

}
