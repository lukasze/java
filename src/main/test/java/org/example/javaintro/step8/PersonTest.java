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
        // given obiekt person, utworzony parametrowym konstruktorem
        // var - doczytac :)
        var lastName = "Nowak";
        Person obiektPersonUtworzonyParametrowymKonstruktorem = new Person("Jan", lastName);


        // when - wywoałanie getName na utworzonym obiekcie i przypisanie do zmiennej typu String
        String stringZwroconyPrzezGetLastName = obiektPersonUtworzonyParametrowymKonstruktorem.getLastName();


        // then - oczekujemy, że zwrócona wartość z getLastName będzie równa wartości przekazanej do konstruktora
        assertEquals(lastName, stringZwroconyPrzezGetLastName);
    }

    @Test
    void multi() {
        // nic nie testujemy - przykad na zastpienie metody main : )
        Person [] people = {
                new Person("Jan", "Kowalski"),
                new Person("Adam", "Nowak"),
                new Person("Agata", "Kowalski")
        };

        for (Person person : people) {
            System.out.println(person);
        }
    }
}