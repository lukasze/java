package org.example.javaintro.step2.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
    TODO 2 klasa testowa - generujemy automatycznie przy pomocy IDE
    Zazwyczaj każda metoda jest testowana wieloma testami, poniżej pojedyńcze przykłady.
 */
class PersonTest {

    /*
        TODO 3 adnotacje - dodają supermoce
        @Test zmienia metodę w metodę testową, rozpoznawaną przez bibliotekę Junit5
     */
    @Test
    void getName() {
//        fail(); - dobra praktyka dla pustego testu

        // given
        String oczekiwanaWrtosc = Person.name;
        // when
        String zwroconaWartosc = Person.getName();
        // then
        assertEquals(oczekiwanaWrtosc, zwroconaWartosc);
    }

    @Test
    void getAge() {
        // given
        int oczekiwanaWartosc = Person.getAge();
        // when
        int zwroconaWartosc = Person.getAge();
        // then
        assertEquals(oczekiwanaWartosc, zwroconaWartosc);
    }
}