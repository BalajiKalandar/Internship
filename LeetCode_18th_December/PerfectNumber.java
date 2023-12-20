package com.java.dec18;

public class PerfectNumber {
public static void main(String[] args) {
	int num=28;
	System.out.println(isPerfectNumber(num));
}
public static boolean isPerfectNumber(int num) {
	int sum=1;
	for(int i=2;i*i<num;i++) {
		if(num%i==0&&i!=num/i) {
			System.out.println("sum of "+sum+ " and " + "num/i "+ num/i);
			sum+=i+num/i;
			System.out.println(sum);
		}
	}
	return sum==num;
}

}
