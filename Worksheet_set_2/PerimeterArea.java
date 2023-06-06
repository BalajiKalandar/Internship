package com.java.fliprobo1;

import java.util.Scanner;

//Write a java program to calculate Area and perimeter of Rectangle

public class PerimeterArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of Rectangle");
		int L = sc.nextInt();
		System.out.println("Enter widht of Rectangle");
		int W = sc.nextInt();
		double A = L * W;
		System.out.println("Area of Rectangle is " + A + " sq.unit");
		double P = 2 * (L + W);
		System.out.println("Perimeter of Rectangle is " + P + " unit");

	}

}
