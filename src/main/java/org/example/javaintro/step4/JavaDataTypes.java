package org.example.javaintro.step4;

public class JavaDataTypes {

    // primitive types
    static boolean aBoolean = true;
    static char aChar = 'A';
    static byte aByte = 10;
    static short aShort = 10;
    static int anInt = 10;
    static long aLong = 10;
    static float aFloat = 10;
    static double dDouble = 10;

    // non-primitive type
    static String aString = "lukasz";

    public static void main(String[] args) {
        // String
        String aStringToUpperCase = aString.toUpperCase();
        System.out.println(aStringToUpperCase);
        // boolean
        System.out.println(aBoolean);
        // int
        System.out.println(anInt);
        // double
        System.out.println(dDouble);
    }


}

