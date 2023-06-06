    package com.java.fliprobo1;

import java.util.Scanner;

public class SwapTwoNo {
	public static void main(String[] args) {
		

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two number two swap");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	System.out.println("Before swaping number are "+ num1+ " "+num2);
	int temp=num1;
	num1=num2;
	num2=temp;
	System.out.println("After swaping numbers are "+ num1+ " "+num2);
	
}
}