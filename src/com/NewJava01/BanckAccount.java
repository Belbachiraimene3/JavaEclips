package com.NewJava01;

public class BanckAccount {

	
	String username;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	public void login(String passedUserNameWhenLogging, String passPaswordWhenLogging) {
		if(username.equalsIgnoreCase(passedUserNameWhenLogging)&&password.equals(passPaswordWhenLogging)) {
			System.out.println("Welcom to Banck Of America, your balance is "+balance);
		}else {
			System.out.println("Username or password is not correct");
		}
		
		
			
	}
	public void printInfo() {
		if(isLoggedIn) {
			System.out.println("Your account number is "+accountNumber+" Your balance is "+balance);
		}
		
			
	}
	
	
}
