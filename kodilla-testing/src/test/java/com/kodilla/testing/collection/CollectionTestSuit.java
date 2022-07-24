package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuit {
    @BeforeEach
    public void beforeEach() {
        System.out.println("Test Case for all: begin");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Test Case after each: end");
    }

    @DisplayName("checking if the class behaves correctly when the list is empty")
    @Test
    void testOddNumbersExtrerminatorEmptyList() {

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");

        //Then
        Assertions.assertEquals(emptyList, result);
    }

    @DisplayName("checking if the class behaves correctly when the list contains even and odd numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing testOddNumbersExterminator method " + result);

        //Then
        Assertions.assertEquals(expected, result);
        Assertions.assertEquals(Arrays.asList(2,4,6), result);

    }
}
