package com.java.fliprobo1;

import java.util.Scanner;
//Write a java program to find table of n

public class TableOfN {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of table");
	int n = sc.nextInt();
	
	int [][]table= new int[n][n];
	System.out.println("Enter elements of the table");
	for(int i=0; i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			table [i][j]=sc.nextInt();
		}
	}
	System.out.println("Elements of Table are");
	for(int i=0; i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.println(table[i][j]+" ");
		}
	}
}
}