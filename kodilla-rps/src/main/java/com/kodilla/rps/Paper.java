package com.kodilla.rps;

public class Paper implements Shape {
    @Override
    public String getShape() {
        return "Paper";
    }

    @Override
    public String toString() {
        return getShape();
    }
}
