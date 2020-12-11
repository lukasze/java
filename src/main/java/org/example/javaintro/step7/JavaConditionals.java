package org.example.javaintro.step7;

public class JavaConditionals {

    // if(boolean)

    /*
        Wejście tylko w jeden blok kodu

        if(true) {
            wchodzę tutaj
        }
     */

    static void printInfoBasedOnValue(int integerToTest){
        boolean iWiekszeOdZera = integerToTest > 0;
        if(iWiekszeOdZera) {
            System.out.println("i większe od zera, wartość i: " + integerToTest);
        } else if(integerToTest < 0) {
            System.out.println("i miejsze od zera, wartość i: " + integerToTest);
        } else {
            System.out.println("i zero: " + integerToTest);
        }
    }

    public static void main(String[] args) {
        printInfoBasedOnValue(10);
        printInfoBasedOnValue(-10);
        printInfoBasedOnValue(0);
    }

}
