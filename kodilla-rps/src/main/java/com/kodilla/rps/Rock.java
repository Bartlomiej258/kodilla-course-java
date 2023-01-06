package com.kodilla.rps;

public class Rock implements Shape {
    @Override
    public String getShape() {
        return "Rock";
    }

    @Override
    public String toString() {
        return getShape();
    }
}
