package com.bridgelabz.logicalprograms;

public class PerfectNumber {
	public static void main(String[]  args)
	{
		int perfectNum = 28;
		int sumOfDivisors = 0;
		for (int index = 1; index <= perfectNum/2; index++)
		{
			if(perfectNum%index ==0) {
				sumOfDivisors = sumOfDivisors + index;
			}
		}
		if(sumOfDivisors == perfectNum) {
			System.out.println(perfectNum + " is a perfect number");
		}
		else {
			System.out.println(perfectNum + " is not a perfect number");
		}
	}
}
