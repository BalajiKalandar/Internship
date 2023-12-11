package com.java.d11dec;

public class CountDigitDivisibleByNumber {
	public static void main(String[] args) {
		int num=121;
		System.out.println(countDigitDivNum(num));
		
	}
	
	public static int countDigitDivNum(int num) {
		String str=String.valueOf(num);
		int count=0;
		for(int i=0;i<str.length();i++) {
			int digit=Character.getNumericValue(str.charAt(i));
			
			if(digit!=0 && num%digit==0) {
				count++;
			}
		}
		return count;
	}

}
