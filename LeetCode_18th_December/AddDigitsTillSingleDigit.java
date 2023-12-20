package com.java.dec18;

public class AddDigitsTillSingleDigit {
	public static void main(String[] args) {
		int num=111111;
		System.out.println(singleDigit(num));
		
	}
	public static int singleDigit(int num) {
		while(num>=10) {
			int sum=0;
			while(num>0) {
				int rem=num%10;
				sum+=rem;
				num/=10;
			}
			num=sum;
		}
		return num;
	}
}


