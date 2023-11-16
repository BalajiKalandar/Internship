package com.java.sixteenthNov;

public class SingleNumber {
	static int findSingle(int []nums) {
		int result=0;
		for(int num:nums) {
			result^=num;
		}
		return result;
	}
	public static void main(String[] args) {
		int []nums= {4,1,2,1,2};
		int uniqueNumber=findSingle(nums);
		System.out.println(uniqueNumber);
	}

}
