package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] array = {2, 2, 2, 2};

        //When
        Double result = ArrayOperations.getAverage(array);

        //Then
        Assertions.assertEquals(2, result);
    }
}
