package com.java.flipDailyQuestion;

public class TrillingZeroes {
    public static void main(String[] args) {
        int n=25;
        int count=5;
        int res=0;
        while(n/count!=0){
            res=res+n/count; //25/5=5;2)25/25=1
            count=count*5;
        }
        System.out.println("Trilling zeroes are "+res);
    }
}
