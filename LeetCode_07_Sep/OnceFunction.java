package com.java.flip7thSep;

import java.util.function.Function;

public class OnceFunction<T, R> {

    private Function<T, R> function;
    private boolean called = false;
    private R result = null;

    public OnceFunction(Function<T, R> function) {
        this.function = function;
    }

    public R apply(T arg) {
        if (!called) {
            result = function.apply(arg);
            called = true;
        }
        return null; // Subsequent calls return null
    }

    public static void main(String[] args) {
        Function<Integer, Integer> fn = x -> x * x;
        OnceFunction<Integer, Integer> onceFn = new OnceFunction<>(fn);

        System.out.println(onceFn.apply(5)); // Output: 25
        System.out.println(onceFn.apply(2)); // Output: null
        System.out.println(onceFn.apply(4)); // Output: null
    }
}

