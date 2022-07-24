package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;

import java.util.List;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

        Calculator calculator = new Calculator();
        int add = calculator.add(2,2);
        if (add == 4) {
            System.out.println("Test: OK");
        } else {
            System.out.println("ERROR");
        }

        int subtract = calculator.subtract(4, 2);
        if (subtract == 2) {
            System.out.println("Test: OK");
        } else {
            System.out.println("ERROR");
        }

    }
}