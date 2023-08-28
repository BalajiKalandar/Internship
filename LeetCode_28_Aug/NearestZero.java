package com.java.s28thdsa;
// completed
public class NearestZero {
	public static void main(String[] args) {
		int []nums= {-3,-5,7,4,43,21,45,22,76,29,2,1,-1};
//		System.out.println("hi");
		System.out.println(findnearest(nums));
	}
	public static double findnearest(int[]nums) {
		double min=Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(min>Math.abs(nums[i])) {
//				System.out.println(" some"+Math.abs(nums[i]));
				min=Math.abs(nums[i]);
			}
		}
		return min;
	}

}
