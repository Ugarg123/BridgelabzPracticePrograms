package com.bridgelabz.logicalprograms;

public class FibonacciSeries {
	
	public static void main(String[] args)
	{
		int number = 10;
		int previousNum = 0;
		int currentNum = 1;
		System.out.print("fibonacci series of " + number + " is " + previousNum + ", " + currentNum);
		for(int index =2; index < number; index++)
		{
			int nextNum = previousNum + currentNum;
			previousNum = currentNum;
			currentNum = nextNum;
			System.out.print(", " + nextNum);
		}
	}
}
