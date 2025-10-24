package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    private final String givenName;
    private final String surName;
    private final LocalDate dateOfBirth;

    Person(String givenName, String surName, LocalDate dateOfBirth) {
        this.givenName = givenName;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
    }
    String getDisplayName() {
        return givenName + " " + surName;
    }

    long getAge(){
        return ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Smith", LocalDate.of(1990, 1, 1));
        System.out.println(person.getDisplayName() + ": " + person.getAge());

    }
}
