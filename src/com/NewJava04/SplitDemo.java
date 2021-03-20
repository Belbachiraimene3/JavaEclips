package com.NewJava04;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String var1= "Today is wedensday";
		
		String [] Sarr=var1.split(" ");
		for(String word:Sarr) {
			System.err.println(word);
		}
		
		String var2= "Syntax is best.Batch 9 is great";
		String [] Sarr2=var2.split("[.]");
		for(String word1:Sarr2) {
			System.err.println(word1);
		}
		
		
		String var="     The weather   is great    ";
		System.out.println(var.replaceAll("[^a-zA-Z]",""));
		
		String Combination =" I am 2150 &%^^";
		String result = Combination.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(result.length());
		
		String Task3 = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String [] Tarr = Task3.split("[?]");
		System.out.println(Tarr.length);
	}

}
