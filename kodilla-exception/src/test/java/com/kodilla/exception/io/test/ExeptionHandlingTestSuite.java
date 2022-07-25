package com.kodilla.exception.io.test;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExeptionHandlingTestSuite {

    @Test
    void testThrowExceptionAndDontThrow() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 4));
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5));
    }
}
