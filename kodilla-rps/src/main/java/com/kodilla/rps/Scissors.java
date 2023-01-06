package com.kodilla.rps;

public class Scissors implements Shape {
    @Override
    public String getShape() {
        return "Scissors";
    }

    @Override
    public String toString() {
        return getShape();
    }
}
