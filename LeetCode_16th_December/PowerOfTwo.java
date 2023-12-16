package com.java.dec16;

public class PowerOfTwo {
	public static void main(String[] args) {
		int num=4;
		System.out.println(powerOfTwo(num));
		System.out.println(powerOfTwo(16));
		System.out.println(powerOfTwo(33));
		
	}
	public static boolean powerOfTwo(int n) {
		if(n<=0) {
			return false;
		}
		return (n&(n-1))==0;
	}

}
