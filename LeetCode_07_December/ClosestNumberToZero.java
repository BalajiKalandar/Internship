package com.java.timest;

public class ClosestNumberToZero {
public static void main(String[] args) {
	int []nums= {-4,-2,1,4,8};
	int result=cloestToZero(nums);
	System.out.println(result);
}

public static int cloestToZero(int[]nums) {
	int closestNumber=Integer.MAX_VALUE;
	int closestDistance=Integer.MAX_VALUE;
	
	for(int num:nums) {
		int distance=Math.abs(num);
		
		if(distance<closestNumber || distance==closestDistance && num>closestNumber) {
			closestNumber=num;
			closestDistance=distance;
		}
	}
	return closestNumber;
}
}
