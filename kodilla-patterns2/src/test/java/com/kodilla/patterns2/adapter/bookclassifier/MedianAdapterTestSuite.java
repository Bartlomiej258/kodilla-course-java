package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

        //Given
        BookA bookA = new BookA("person1", "title1", 2000, "signature1");
        BookA bookB = new BookA("person2", "title2", 2010, "signature2");
        BookA bookC = new BookA("person3", "title3", 2020, "signature3");

        //When
        Set<BookA> bookASet = new HashSet<>();
        bookASet.add(bookA);
        bookASet.add(bookB);
        bookASet.add(bookC);

        MedianAdapter medianAdapter = new MedianAdapter();

        //Then
        int result = medianAdapter.publicationYearMedian(bookASet);
        System.out.println(result);
        assertEquals(2010, result);

    }
}
