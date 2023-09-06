package com.java.fifthSep23;

public class TotalNumberdivisibleToNumber {
	public static void main(String[] args) {
		int num=624;
		System.out.println(calculate(0));
		
	}
	public static int calculate(int num) {
//		if(num==0) {
//			return -1;
//		}
		int count=0;
		int temp=num;
		while(num>0) {
			int digit=num%10;
			if(num%digit==0) {
				count++;
				
			}
			num=num/10;
		}
		return count;
	}

}
