	package com.java.FlipRoboAssignment3;
	
	class Addition {
		int sum = 0;
	
		public int addTwo(int a, int b) {
			sum = a + b;
			return sum;
		}
	}
	
	public class Method_Call {
	
		public static void main(String[] args) {
			Addition ref = new Addition();
			ref.addTwo(45, 34);
			System.out.println("Addition of two number is " + ref.addTwo(45, 34));
		}
	}
