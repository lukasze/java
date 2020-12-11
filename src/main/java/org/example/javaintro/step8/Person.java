package org.example.javaintro.step8;

public class Person {
    String name;
    String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
