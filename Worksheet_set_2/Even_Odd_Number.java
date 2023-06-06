package com.java.fliprobo1;

import java.util.Scanner;

//  Write a java program to check even or odd number 

public class Even_Odd_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter a number to check weather it is even or odd");
			int num = sc.nextInt();
			if (num % 2 == 0) {
				System.out.println(num + " is a Even Number");
			} else
				System.out.println(num + " is a Odd Number");

		}
		System.out.println("You reached your limit");
		System.out.println("Thank you");

	}

}
