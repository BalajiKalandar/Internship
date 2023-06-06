package com.java.fliprobo1;

import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter first number");
		int num1 = sc.nextInt();
		System.out.println(" Enter Second number");
		int num2 = sc.nextInt();
		System.out.println(" Enter Third number");
		int num3 = sc.nextInt();

		if (num1 > num2) {
			if (num1 > num3)
				System.out.println(num1 + " (First) is the greatest number");
			else
				System.out.println(num3 + " (Third) is the greatest number");

		} else {
			if (num2 > num3)
				System.out.println(num2 + " (Second)is the greatest number");

			else
				System.out.println(num3 + " (Third) is the greatest number");
		}
	}

}
