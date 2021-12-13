package com.bridgelabz.functionalprograms;
import java.util.Scanner;
public class Quadratic {
	static void roots(int a, int b, int c) {
		int delta = Math.abs(b * b - 4 * a * c);
		double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
		double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
		System.out.println(x1);
		System.out.println(x2);
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a");
			int a = sc.nextInt();
			System.out.println("enter b");
			int b = sc.nextInt();
			System.out.println("enter c");
			int c = sc.nextInt();
			roots(a, b, c);
			sc.close();
		}catch(Exception e) {
			System.out.println("enter correct input");
		}
	}
}
