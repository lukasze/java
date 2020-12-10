package org.example.javaintro.step2;
/*
 TODO utwórz klasę na podstawie poniższego diagramu UML:
 wywołaj w metodzie main Greeter.greet() i wypisz do konsoli zwróconą wartość
+------------------------------------------+
|                                          |
|                                          |
|                Greeter                   |
|                                          |
|----------------------------------------- |
|                                          |
|         greeting: String                 |--- statyczne pole o wartości "Hello, World!"
|                                          |
|----------------------------------------- |
|                                          |
|         greeter(): String                |--- statyczna metoda zwracająca greeting
|                                          |
+------------------------------------------+

 */


// ----------------------------- nazwa klasy

class Greeter {

// ----------------------------- dane - pola klasy

   static String greeting = "Hello, World!";


// ------------------------------ metody

    static String greeter() {
        return greeting;
    }
// ------------------------------

    public static void main(String[] args) {
        System.out.println(Greeter.greeter());
    }
}
