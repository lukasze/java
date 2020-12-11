package org.example.javaintro.step6;

public class JavaOperators {
    // unary ++i, i++, --i, i--
    // arithmetic +, -, /, *, %
    // logical &&, ||
    // relational ==, <=, >=, !=
    // ternary ? :

    public static void main(String[] args) {
        // unary
        int i = 10;
        System.out.println(i--);

        // arithmetic
        int x = 10; int y = 20;
        int z =x + y;
        System.out.println(z);

        // arithmetic + unary
        System.out.println(x++ + --y);

        // logical
        boolean isWoman = false;
        boolean isRetired = false;
        // true - wszystkie muszą być true
        System.out.println(isWoman && isRetired);
        // true - minimum jeden musi być true
        System.out.println(isWoman || isRetired);

        // relational
        int a = -10;
        int b = 20;

        System.out.println("a < b: " + (a < b));
        System.out.println("a <= -10: " + (a <= -10));
        System.out.println("a >= -10: " + (a >= -10));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a > -200: " + (a > -200));

        // wariant 1
        System.out.println("a != 10: " + (a != 10));
        // wariant 2
        String komunikat = "a != 10: ";
        boolean aMniejszeOdB = a != 10;
        String napisKtoryChcemyWydrukowac = komunikat+aMniejszeOdB;
        System.out.println(napisKtoryChcemyWydrukowac);

    }
}
