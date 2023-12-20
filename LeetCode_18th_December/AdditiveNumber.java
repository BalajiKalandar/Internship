package com.java.dec18;

public class AdditiveNumber {
	public static void main(String[] args) {
		String num="112358";
		System.out.println(isAdditiveNumber(num));
	}
	public static boolean  isAdditiveNumber(String num) {
		int n=num.length();
		
		for(int i=1;i<=n/2;i++) {
			for(int j=1;Math.max(i,j)<=n-i-j;j++) {
				try {
					if(isAdditive(num,i,j)) {
						return true;
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	
	private static boolean isAdditive(String num,int i,int j) {
		if(num.charAt(0)=='0' && i>1) {
			return false;
		}
		if(num.charAt(i)=='0'&&j>1) {
			return false;
		}
		String num1=num.substring(0,i);
		String num2=num.substring(i,i+j);
		
		int startIndex=i+j;
		while(startIndex<num.length()) {
			String sum=addStrings(num1,num2);
			if(!num.startsWith(sum,startIndex)) {
				return false;
			}
			startIndex +=sum.length();
			num1=num2;
			num2=sum;
		}
		return true;
	}
	private static String addStrings(String num1,String num2) {
		StringBuilder result=new StringBuilder();
		int carry=0;
		int i=num1.length()-1;
		int j=num2.length()-1;
		
		while(i>=0||j>=0||carry>0) {
			int x=(i>=0)?num1.charAt(i)-'0':0;
			int y=(j>=0)?num2.charAt(j)-j:0;
			int sum=x+y+carry;
			carry=sum/10;
			result.append(sum%10);
			i--;
			j--;
		}
		return result.reverse().toString();
	}

}
