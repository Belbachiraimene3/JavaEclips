package com.Class10;

public class Arrays {

	public static void main(String[] args) {
		int[] array=new int[5];
		
		array[0]=10;
		array[1]=12;
		array[2]=15;
		array[3]=9;
		array[4]=13;
		
		System.out.println(array[0]+array[4]);
		
		double [] numbers = new double[2];
		numbers[0]=10.99;
		numbers[1]=19.01;
		
		System.out.println(numbers[0]);
		
		String[] name = new String [5];
		name[0]="Aimen";
		name[1]="kawter";
		name[2]="Mohamed";
		name[3]="Baby";
		System.out.println(name[3]);
		
		boolean [] b=new boolean[3];
		
		b[0]=true;
		b[1]=true;
		b[2]=false;
		
		System.out.println(b[2]);
		
		
		int size=array.length;
		System.out.println(size);
		
		char [] grade = new char[5];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='F';
		
		System.out.println(grade[1]);
		
		
		char [] grades= {'A','B','C','D','F'};
		
		System.out.println(grades[4]);
		
		
		//String[] name = new String [5];
		name[0]="Aimen";
		name[1]="kawter";
		name[2]="Mohamed";
		name[3]="Oran";
		System.out.println(name[3]);
		
		//String [] name= {"Aimen", "kawther","Mohamed","Oran"};
		
		System.out.println(grades[1]);
		
	}

}
