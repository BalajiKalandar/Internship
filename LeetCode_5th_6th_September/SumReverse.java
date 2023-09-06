package com.java.fifthSep23;

public class SumReverse {
	public static void main(String[] args) {
		print(123);
		print(181);
		System.out.println("hi");
		
	}
	public static boolean print(int num) {
		for(int i=0;i<num;i++) {
			int revI=reverse(i);
			if(i+revI==num) {
				return true;
			}
		}
		return false;
	}
	
	public static int reverse(int num) {
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			}

		return rev;
		
	}

}
