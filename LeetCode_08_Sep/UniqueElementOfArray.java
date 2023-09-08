package com.java.flip08thSep;

import java.util.Arrays;

public class UniqueElementOfArray {
	public static void main(String[] args) {
		int nums[]= {1,2,3,2,3,1,5,9,43,23,4,13,43,23,12,4,9,5,13};
		System.out.println("return value is "+singleOne(nums));
		
	}
	public static int singleOne(int nums[]) {
		int single=0;
		int n=nums.length;
		Arrays.sort(nums);
		for(int k:nums) {
			System.out.print(k+", ");
		}
		System.out.println();
		int i=0;
		for(;i<nums.length-2;i=i+2) {
				if(nums[i]!=nums[i+1]) {
				single= nums[i];
				i++;
				}
		}
		
		return single;
	}

}
