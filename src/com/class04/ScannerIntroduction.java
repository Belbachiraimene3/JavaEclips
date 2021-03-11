package com.class04;

public class ScannerIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	boolean morning=true;
	boolean classtoday =false;
	
	if (morning) {
		
		
		System.out.println("Let me check if i have class");
		
	if(classtoday) {
			System.out.println("Good morning class");
		
	}else {
		System.out.println("Good morning family");
	}
	
	}
	
	System.out.println("-------------------------------------------------");
	
	boolean anyallergy=true;
	boolean pollenallergy=false;
	
	if (anyallergy) {
		System.out.println("Let's check which allergy you have");
		if(pollenallergy) {
			System.out.println("Do not get close to the trees");
			
		}else {
			System.out.println("Ok, you dont have pollen alergy");
		}
	}else {
		System.out.println("Yoou are lucky you dont have any allergy");
	}
System.out.println("-----------------------------------------------------");
	
	boolean Friday=true;
	int day=13;

	if (Friday) {
		System.out.println("Let's check it's the 13th");
		if(day==13) {
			System.out.println("Watch scary movie");
		}else {
			System.out.println("Watch any other movie");
		}
	
}else {
	System.out.println("Stay at home and study");
}
	
	System.out.println("---------------------------------------------------");
	
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
	}
	

}
