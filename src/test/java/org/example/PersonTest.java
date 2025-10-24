package org.example;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void testGetDisplayName() {
        Person person = new Person("Josh", "Hayden", LocalDate.of(2000,5,20));
        String displayName = person.getDisplayName();
        assertEquals("Josh Hayden", displayName);
    }

    @Test
    public void testgetAge() {
        Person person = new Person("Joey", "Doe", LocalDate.of(2000,5,20));
        long age = person.getAge();
        assertEquals(25, age);
    }
}
