package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        //When
        double add = calculator.add(2, 2);
        double sub = calculator.sub(10, 5);
        double mul = calculator.mul(10, 5);
        double div = calculator.div(15, 5);

        //Then
        assertEquals(4, add);
        assertEquals(5, sub);
        assertEquals(50, mul);
        assertEquals(3, div);
    }
}
