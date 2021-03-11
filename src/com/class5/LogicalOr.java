package com.class5;

public class LogicalOr {
	public static void main(String[] args) {
		String day = "sunday";
		
	if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday") ) {
		System.out.println("Today is my day off");
	}else if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wedensday")) {
		System.out.println("Today I have manual class");
	}else if (day.equalsIgnoreCase("Thursday")) {
		System.out.println("Today I have review class");
	}else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
		System.out.println("Today I have Java class");
	}else {
		System.out.println(day+" is invalid");
	}
	
	
	
	
	}
	
	
	
	
}
