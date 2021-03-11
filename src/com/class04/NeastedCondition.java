package com.class04;

public class NeastedCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean morning=false;
		boolean classToday=true;
		
		if (morning) {
			System.out.println("I am going to work");
			
		}else {
			System.out.println("Let me chack if i have class today");
			if (classToday) {
				System.out.println("I will attend the class");
			}else {
				System.out.println("I will relax");
			}
			
		}
		
		System.out.println("-------------------------------------------------");
		
		boolean diploma=true;
		double gpa=3.5;
		
		if(diploma) {
			System.out.println("Congratulations");
			if(gpa>3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
			
		}else {
			System.out.println("You should get a degree");
		}
	
		double rate=4.5;
		int price=200000;
		
		if (rate>4.5) {
			System.out.println("Will not buy a house");
		}else {
			System.out.println("Will concider buying a house");
			if(price>200000) {
				System.out.println("will need a loan");
			}else {System.out.println("Will pay cash");
			
			}
		}
		
	}

}
