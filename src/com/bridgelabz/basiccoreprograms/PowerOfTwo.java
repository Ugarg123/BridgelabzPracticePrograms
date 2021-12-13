package com.bridgelabz.basiccoreprograms;
import java.util.Scanner;
public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>30) {
			System.out.println("no, should be 30 or below");
		}
		else {
			int i=1;
			while(i<=n) {
				if(i*i<=Math.pow(2, 6)) {
					System.out.println(i+" * "+i+" = "+i*i);
					if((i*i)%4==0) System.out.println("Leap Year");
					else
						System.out.println("not leap year");
					i++;
				}
			}
		}
	}
}
