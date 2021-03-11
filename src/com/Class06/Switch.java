package com.Class06;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day =1;
		String weekDay;
		switch (day) {
		
		case 1:
			weekDay ="Monday";
			break;
		case 2:
			weekDay ="Tuesday";
			break;
		case 3:
			weekDay ="Wedensday";
			break;
		case 4:
			weekDay ="Thursday";
			break;
		case 5:
			weekDay ="Friday";
			break;
		case 6:
			weekDay ="Saturday";
			break;
		case 7:
			weekDay ="Sunday";
			break;	
		default :
			weekDay="Invalid";
		}
		
		System.out.println("Today is "+weekDay);
		System.out.println("----------------------moree Csenarios---------------------");
		
		
		char gender='M';
		String description;
		switch(gender) {
		
			case 'M':
				description="Male";
				break;
			case 'F':
				description="Female";
				break;
			default:
				description="N/A";
		}
		
		System.out.println(description);
		
		System.out.println("----------------------moree Csenarios---------------------");
		
		
		String country,food;
		
		
		
	}
	
	

}
