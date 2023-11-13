package com.java.flipDailyQuestion;

public class Prime_Substraction_Operation {
    public static void main(String[] args) {
        int num1 []={ 6,8,11,12};
        System.out.println(primeSubOperation(num1));
        int num2 []={ 4,9,6,10};
        System.out.println(primeSubOperation(num2));
        int num3 []={ 5,8,3};
        System.out.println(primeSubOperation(num3));

    }
    static boolean primeSubOperation(int []nums){
        int n=nums.length;
        for(int i=1;i<n;i++){
            int curr=nums[i];
            int j=i-1;

            while(j>=0 && nums[j]>=curr){
                j--;
            }
            if(j>=0){
                int diff=curr-nums[j];
                if(!isPrime(diff)){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        if(num==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
