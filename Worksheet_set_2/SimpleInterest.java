package com.java.fliprobo1;

import java.util.Scanner;

// Write a java program to calculate Simple Interest
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle(Loan Amount)");
		double P=sc.nextDouble();
		System.out.println("Enter Tenure Period (in year)");
		byte N=sc.nextByte();
		System.out.println("Enter Rate of Interest (Annually)");
		double R=sc.nextDouble();
		
		double I=(P*N*R)/100;
		System.out.println(" Rate of intesrest on "+P+" at rate "+R+"% for "+N+" year is "+I+" Rupees only");
		
	}

}
