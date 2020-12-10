package org.example.javaintro.step2.exercises;

/*
      TODO  w pakiecie ...step 2 utwórz pakiet exercises a w nim klasę Person
      - zainicjalizuj pola dowolnymi wartościami
      - po utworzeniu utwórz main i wydrukuj do konsoli name i age używając metod z klasy Person
        (wszystkie składniki statyczne)
              +-------------------------+
              |                         |
              |         Person          |
              |-------------------------|
              |                         |
              |     name: String        |
              |     age: int            |
              |-------------------------|
              |                         |
              |   getName() : String    |
              |   getAge() : int        |
              +-------------------------+

   */
public class Person {

    static String name = "Jan";
    static int age = 30;

    static String getName() {
        return name;
    }

    static int getAge() {
        return age;
    }

    public static void main(String[] args) {
        //Przykład na konkatenację String'ów:
        System.out.println("Imię: "+ name +", wiek: " + age + " lat.");
    }
}
