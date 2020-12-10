package org.example.javaintro.step2;

class Greeter {

   static String greeting = "Hello, World!";

    static String greeter() {
        return greeting;
    }

    public static void main(String[] args) {
        System.out.println(Greeter.greeter());
    }
}
