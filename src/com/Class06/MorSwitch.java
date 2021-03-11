package com.Class06;

import java.util.Scanner;

public class MorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		String country,food;
		
		country =scan.next();
		
		switch(country.toLowerCase()) {
		
		case "usa":
			food="burger";
			break;
		case "afghanistan":
			food="kebab";
			break;
		case "vitnam":
			food="pho";
			break;	
		case "oland":
			food="pierogi";
			break;	
		case "kazakastan":
			food="horse";
			break;
		case "belarus":
			food="draiki";
			break;
		case "tajikistan":
			food="pov";
			break;	
		case "mexico":
			food="tacos";
			break;
		case "algeria":
			food="couscous";
			break;
		default:
			food="unknown";
			
		}
		System.out.println("Your favorit food is "+food);
	}

}
