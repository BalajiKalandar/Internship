package com.java.dec19Nov;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
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
        // Example usage:
        int n1 = 3;
        System.out.println(fizzBuzz(n1)); // Output: ["1","2","Fizz"]

        int n2 = 5;
        System.out.println(fizzBuzz(n2)); // Output: ["1","2","Fizz","4","Buzz"]

        int n3 = 15;
        System.out.println(fizzBuzz(n3)); // Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
    }
}

