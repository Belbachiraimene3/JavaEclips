package com.NewJava03;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="   This Aimen *!  ";
		String name1 = new String("Aimen  ");
		
		
		if (name.contains("!")||name.contains("  ")) {System.out.println("Spaces and ! are not allowd");
		
		System.out.println(name1.startsWith("a"));
		}
		
		
		
		
		String userName="";
		String password="";
		String confirme="";
		
		if (userName.isEmpty()|| password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
			
		}else if(password.length()>8) {
				System.out.println("Password is too short");
			}else if (password.equals(userName)) {
				System.err.println("Password cannot contain username");
			}else if (!password.equals(confirme)) {
				System.err.println("Passwords do not match");
			}else {
				System.out.println("Your username and password has been created");
			
			
			
			
			
			
		}
		
	}

}
