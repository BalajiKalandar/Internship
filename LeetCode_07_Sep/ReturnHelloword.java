package com.java.flip7thSep;

public class ReturnHelloword implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World");
    }

    public static Runnable helloWorld() {
        return new ReturnHelloword();
    }

    public static void main(String[] args) {
        Runnable f1 = helloWorld();
        f1.run();

        Runnable f2 = helloWorld();
        f2.run();
    }
}
