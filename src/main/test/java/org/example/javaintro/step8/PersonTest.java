package org.example.javaintro.step8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        // given

        Person obiektPersonUtworzonyBezparametrowymKonstruktorem = new Person();

        // when - wywoałanie getName na utworzonym obiekcie i przypisanie do zmiennej typu String

        String stringZwroconyPrzezGetName = obiektPersonUtworzonyBezparametrowymKonstruktorem.getName();

        // then - oczekujemy, że zwrócona wartośś z getName będzie równa null
        assertEquals(null, stringZwroconyPrzezGetName);

    }

    @Test
    void getLastName() {

    }
}