package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBook() {
        //Given
        Library library = new Library("Horror");
        Book book1 = new Book("The Walking Dead", "Robert Kirkman", LocalDate.of(2003, 10, 1));
        Book book2 = new Book("Black Phone", "Joe Hill", LocalDate.of(2022, 7, 1));
        Book book3 = new Book("NOPE", "Jordan Peele", LocalDate.of(2022, 8, 1));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCopyLibrary = null;
        try {
            deepCopyLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println("oryginal library " + library);
        System.out.println("shallow copy " + clonedLibrary);
        System.out.println("deep copy " + deepCopyLibrary);
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepCopyLibrary.getBooks().size());
        assertEquals(library.getBooks().size(), clonedLibrary.getBooks().size());
        assertNotEquals(clonedLibrary.getBooks().size(), deepCopyLibrary.getBooks().size());
    }
}
