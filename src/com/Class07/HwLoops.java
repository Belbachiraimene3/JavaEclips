package com.Class07;

public class HwLoops {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<=50; i+=2) {
			
			sum+=i;
		}
		
		System.out.print(sum);
		
		System.out.println();
		
		int odd=0;
		for(int i=0; i<=50; i++) {
			
			if(i%2!=0)
			odd+=i;
		
		}
		System.out.print(odd);
		System.out.println();
		System.out.print(sum+odd);
	}

}
