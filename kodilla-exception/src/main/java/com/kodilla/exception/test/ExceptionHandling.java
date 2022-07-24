package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(4, 1);
        } catch (Exception e) {
            System.out.println("Please validate arguments " + e);
        } finally {
            System.out.println("Finally: finish");
        }
    }
}
