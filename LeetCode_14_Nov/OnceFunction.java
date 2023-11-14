package com.java.flipDailyQuestion;

import java.util.function.BiFunction;
import java.util.function.Function;

public class OnceFunction<T, R> {
    private boolean hasBeenCalled = false;
    private R result;

    public Function<T, R> once(BiFunction<T, T, R> fn) {
        return (a) -> {
            if (!hasBeenCalled) {
                result = fn.apply(a, a);
                hasBeenCalled = true;
                return result;
            } else {
                return null;
            }
        };
    }

    public static void main(String[] args) {
        // Example usage:
        OnceFunction<Integer, Integer> onceFunction = new OnceFunction<>();
        BiFunction<Integer, Integer, Integer> fn1 = (a, b) -> (a + b);
        Function<Integer, Integer> onceFn1 = onceFunction.once(fn1);

        System.out.println(onceFn1.apply(1));  // Output: 2
        System.out.println(onceFn1.apply(2));  // Output: null, fn was not called

        OnceFunction<Integer, Integer> onceFunction2 = new OnceFunction<>();
        BiFunction<Integer, Integer, Integer> fn2 = (a, b) -> (a * b);
        Function<Integer, Integer> onceFn2 = onceFunction2.once(fn2);

        System.out.println(onceFn2.apply(5));  // Output: 25
        System.out.println(onceFn2.apply(2));  // Output: null, fn was not called
        System.out.println(onceFn2.apply(4));  // Output: null, fn was not called
    }
}

