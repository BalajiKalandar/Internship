package com.java.flip_14th_August;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int n = 20; // Replace with the desired value of n
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> answer = fizzBuzz.fizzBuzz(n);
        System.out.println(answer);
    }
}

