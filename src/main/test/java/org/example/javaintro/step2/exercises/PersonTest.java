package org.example.javaintro.step2.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {

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