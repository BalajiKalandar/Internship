package com.java.dec15;

import java.util.function.BiFunction;

public class OnceFunctionCall {

    public static BiFunction<Integer, Integer, Integer> once(BiFunction<Integer, Integer, Integer> fn) {
        boolean called = false;

        return (a, b) -> {
            if (!called) {
                called = true;
                return fn.apply(a, b);
            } else {
                return null; // or throw an exception, depending on your requirements
            }
        };
    }

    public static void main(String[] args) {
        // Example usage:
        BiFunction<Integer, Integer, Integer> fn1 = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> onceFn1 = once(fn1);

        System.out.println(onceFn1.apply(1, 2));  // Output: 3
        System.out.println(onceFn1.apply(2, 3));  // Output: null

        BiFunction<Integer, Integer, Integer> fn2 = (a, b) -> a * b;
        BiFunction<Integer, Integer, Integer> onceFn2 = once(fn2);

        System.out.println(onceFn2.apply(5, 7));  // Output: 35
        System.out.println(onceFn2.apply(2, 3));  // Output: null
        System.out.println(onceFn2.apply(4, 6));  // Output: null
    }
}
