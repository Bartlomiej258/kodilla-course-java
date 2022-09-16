package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @Autowired
    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    double add(double a, double b) {
        double result = a + b;
        display.displayValue(result);
        return result;
    }

    double sub(double a, double b) {
        double result = a - b;
        display.displayValue(result);
        return result;
    }

    double mul(double a, double b) {
        double result = a * b;
        display.displayValue(result);
        return result;
    }

    double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("don't divide by zero");
        }
        double result = a / b;
        display.displayValue(result);
        return result;
    }

}
