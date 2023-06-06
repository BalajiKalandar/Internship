package com.java.fliprobo1;
import java.util.Scanner;

//Prime Number : Required minimum two factors
// Composite Number: Required more than two factors.

public class PrimeOrCompositeNo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to check Prime or Composite");
	int num=sc.nextInt();
	int flag=0;
	
	if(num==0 || num==1)
	{
		System.out.println(num+" is neither prime or not Composite Number");
	return;
	}
	else
		for(int i=2; i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				System.out.println(num+" is a Composite Number");
				flag=1;
				return;
			}
		}
	if(flag==0)
	{
		System.out.println(num+" is a prime number");
	}
	

}
}