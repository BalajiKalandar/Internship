package com.java.dec18;

public class powerOfThree {
public static void main(String[] args) {
	int num=81;
	System.out.println(isPowerOfThree(num));
}
public static boolean isPowerOfThree(int num) {
	
	if(num<=0)return false;
	while(num%3==0) {
		 num=num/3;
	}
	return num==1;
}
}
