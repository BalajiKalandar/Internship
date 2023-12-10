package com.java.timest;

import java.util.Arrays;

public class OneD_TwoD_Array {
	public static void main(String[] args) {
		int []nums= {1,2,3,4};
				int m=2;
				int n=2;
				
				int res[][]=conversion(nums,m,n);
				
				System.out.println(Arrays.deepToString(res));
		}
	
	public static int[][] conversion(int[]nums,int m, int n){
		int len=nums.length;
		if(m*n!=nums.length) {
			return new int[0][0];
		}
		
		int result[][]=new int [m][n];
		
		for(int i=0;i<len;i++) {
			result[i/n][i%n]=nums[i];
		}
		return result;
	}
	}


