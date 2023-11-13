package com.java.flipDailyQuestion;

public class HelloWorldCreator {

    public static void main(String[] args) {
        HelloWorldFunction f1 = createHelloWorld();
        System.out.println(f1.apply()); // Output: "Hello World"
    }

     static HelloWorldFunction createHelloWorld() {
        return () -> "Hello World";
    }

    interface HelloWorldFunction {
        String apply();
    }
}
