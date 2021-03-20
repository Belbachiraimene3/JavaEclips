package com.NewJava03;

public class Student {

	public static void main(String[] args) {
		String userName="Belabchir";
		String password="Binatta357951$";
		
		if (userName.startsWith(" ")|| password.startsWith(" ")) {
			System.out.println("Username and Password cannot be empty");
			
		}else {
			
			if(password.length()<8) {
				System.out.println("Password is too short");
			}else if (password.equals(userName)) {
				System.err.println("Password cannot contain username");
			}else if (!password.equals(password)) {
				System.err.println("Passwords do not match");
			}else {
				System.out.println("Your username and password has been created");
			}
	}
}
}
