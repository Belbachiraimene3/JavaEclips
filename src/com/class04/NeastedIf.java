package com.class04;

public class NeastedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean assignment=true;
		int score=65;
		
		if (assignment) {
			System.out.println("We will check the score");
			if (score>90) {
				System.out.println("Great job");
			}else if (score>80) {
				System.out.println("Good job");
			}else if (score>70) {
				System.out.println("Good, but try to do better");
			}else {
				System.out.println("Good for trying, but you need to study more");
			}
		}else {
			System.out.println("Please make sure you complete all assignments on time");
		}
		
		System.out.println("------------------------------------");
		
		int age=18;
		int weight=110;
		
		if (age>=18) {
			
			if(weight>110) {
				System.out.println("you can donate");
			}else {
				System.out.println("you can not donate cause of your weight");
			}
				
		}else {
			System.out.println("You can not donate cause of your age");
		}
		
		
		
	}
	
	

}
