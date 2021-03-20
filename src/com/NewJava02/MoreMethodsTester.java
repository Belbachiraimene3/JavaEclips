package com.NewJava02;

public class MoreMethodsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoreMethodes Methodes = new MoreMethodes();
		
		System.out.println(Methodes.print());
		
		System.out.println(Methodes.doubleValue(5));
		
		System.out.println(Methodes.a());
		
		Methodes.isRaining(true);
		
		Methodes.Batch();
		
		System.out.println(Methodes.larger(20,100));
		
		Methodes.Even(11);
		
		double [] arr= {10.2,25,30};
		System.out.println(Methodes.SumArray(arr));
		
		System.out.println(Methodes.isMirror("ABA"));
		
		Methodes.syntaxTechnologies();
		Methodes.syntaxStudents();
	}

}
