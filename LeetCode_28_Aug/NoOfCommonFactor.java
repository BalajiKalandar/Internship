package com.java.s28thdsa;

import java.util.ArrayList;
import java.util.Arrays;

public class NoOfCommonFactor {
	public static void main(String[] args) {
		
		int z=totalCommonFactor(48,120);
		System.out.println("common factors are "+z);
		
	}
	public static int totalCommonFactor(int a, int b) {
//		int[]sum=new int[n];
		ArrayList<Integer> ref = new ArrayList<Integer>();
		int min=a<b?a:b;
		System.out.println("min of two is "+min);
		int count=0;
		while(min>0){
		
			if(a%min==0 && b%min==0) {
				ref.add(min);
				count++;
//				System.out.println("count"+count);
				}
			min--;
		}
		System.out.println("Common factors of "+a +" & "+b+" is");
		for(int i:ref) {
			System.out.print(i+",");
		}
		System.out.println("size of arraylist is "+ref.size());
		System.out.println();
		return count;
	}

}
