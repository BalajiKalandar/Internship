package com.java.sixteenthNov;
import java.util.*;

public class GenerateParenthesis {
	static List<String> generate(int n){
		List<String>result=new ArrayList<>();
		helperFunction(n,0,0,"",result);
		return result;
	}
	static void helperFunction(int n, int openCount, int closeCount,String current, List<String>result) {
		if(current.length()==2*n) {
			result.add(current);
		}
		if(openCount<n) {
			helperFunction(n,openCount+1,closeCount,current+"(",result);
		}
		if(closeCount<openCount) {
			helperFunction(n,openCount,closeCount+1,current+")",result);
		}
	}
	
	public static void main(String[] args) {
		int n1=5;
		List<String>ref=generate(n1);
		System.out.println(ref);
	}

}
