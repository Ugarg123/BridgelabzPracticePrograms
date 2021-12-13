package com.bridgelabz.basiccoreprograms;

public class LeapYear {
	public static void main(String[] args)
	{
		int leapYear = 1900;
		boolean isLeapYear = false;
		if(String.valueOf(leapYear).length() == 4) {
			if( leapYear % 4 ==0) {
				
				if(leapYear % 100 ==0) {
					if(leapYear % 400 ==0) {
						isLeapYear = true;	
					}
					else {
						isLeapYear = false;
					}
				}
				else {
					isLeapYear = true;
				}
			}
			else {
				isLeapYear = false;
			}
		}
		else {
			System.err.println("year should be a 4 digit number");
		}
		
		if(isLeapYear== true) {
			System.out.println(leapYear + " is a leap Year");
		}
		else {
			System.out.println(leapYear + " is not a leap Year");
		}
	}

}
