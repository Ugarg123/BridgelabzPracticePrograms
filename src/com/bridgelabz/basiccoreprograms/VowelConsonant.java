package com.bridgelabz.basiccoreprograms;
import java.util.*;
public class VowelConsonant {
	public static void main(String[] args) {
		System.out.println("Enter a character :");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			System.out.println("given character is an vowel");
		else
			System.out.println("given character is a consonent");

	}
}
