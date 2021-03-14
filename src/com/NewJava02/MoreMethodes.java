package com.NewJava02;

public class MoreMethodes {

	String print() {
		
		return "Hi";
		
	}
	double doubleValue (double num1) {
		return num1*2;
	}
	char a() {
		return 'A';
	}
	void isRaining(boolean isRain) {
		if(isRain) System.out.println("please take the umbrella");
		else System.out.println("Please go fo a walk");
	}
	
	void Batch() {
		for (int i=0; i<5; i++); 
		System.out.println("Bach 9 is the best");
	
		}
	
	int larger(int x,int y) {
		if(x<y) return y;
		else  return x;
	}
	void Even(int num) {
		
		if(num%2==0) System.out.println("even");
		else  System.out.println("odd");
	}
	
	double SumArray (double [] arr) {
		
		double sum=0;
				for(double element :arr) {
					sum+=element;
				}
		return sum;
	}
	
	boolean isMirror(String s) {
		String news="";
		
		for (int i=s.length()-1; i>=0; i--) {
			System.out.println(i+" "+s.charAt(i));
			news+=s.charAt(i);
		}
		System.out.println(news);
		if (s.equals(news)) return true;
		else return false;
	}
	
	
}
