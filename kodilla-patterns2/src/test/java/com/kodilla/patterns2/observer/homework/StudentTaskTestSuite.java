package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTaskTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Student jan = new Student("Jan");
        Student tomasz = new Student("Tomasz");

        Mentor kamil = new Mentor("Kamil");
        Mentor marcin = new Mentor("Marcin");

        jan.registerObserver(kamil);
        tomasz.registerObserver(marcin);

        //When
        jan.addTask("create DB");
        jan.addTask("add dependency");

        tomasz.addTask("create DB");
        tomasz.addTask("add dependency");

        //Then
        assertEquals(2, kamil.getUpdateCount());
        assertEquals(2, marcin.getUpdateCount());
    }
}
