package com.bridgelabz.logicalprograms;

public class CouponNumber {

	public static void main(String[] args) {
		int CouponGenerate = 5;
		int min = Integer.MIN_VALUE-1;
		int max = Integer.MAX_VALUE+1;
		for (int i=0; i<CouponGenerate; i++) {	
		int couponNum = min + (int) (Math.random() * max);
			System.out.println("Coupan Number is = "+couponNum);
		}
	}			
}
