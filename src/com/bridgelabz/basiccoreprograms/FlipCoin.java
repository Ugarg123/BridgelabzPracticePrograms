package com.bridgelabz.basiccoreprograms;

public class FlipCoin {
	public static void main(String[] args) {
		int numOfFlips = 10;
		int tails = 0;
		int heads = 0;
		if(numOfFlips <=0) {
			System.err.println("Number of flips cant be less than zero");
		}
		else {
			for (int index = 0; index < numOfFlips; index++)
			{
				if(Math.random() < 0.5) {
					tails++;
				}
			}
			double percentageOfTails = (tails*100)/numOfFlips;
			double percentageOfHeads = 100 - percentageOfTails;
			System.out.println("percentage of tails : " + percentageOfTails);
			System.out.println("percentage of heads : " + percentageOfHeads);
		}	
	}
}
