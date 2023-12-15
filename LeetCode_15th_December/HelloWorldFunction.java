package com.java.dec15;

import java.util.function.Supplier;

public class HelloWorldFunction {

    public static Supplier<String> createHelloWorld() {
        return () -> "Hello World";
    }

    public static void main(String[] args) {
        // Example usage:
        Supplier<String> helloWorldFunction = createHelloWorld();
        System.out.println(helloWorldFunction.get());  // Output: Hello World

        // Additional example with arguments
        helloWorldFunction = createHelloWorld();
        System.out.println(helloWorldFunction.get());  // Output: Hello World
    }
}
