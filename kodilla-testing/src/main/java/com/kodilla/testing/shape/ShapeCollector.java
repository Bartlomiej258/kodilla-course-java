package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    public List<Shape> shapes = new ArrayList<>();

    public int getShapesQuantity() {
        return shapes.size();
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape result = null;
        if (n >= 0 && n < getShapesQuantity()) {
            result = shapes.get(n);
        }
        return result;
    }

    public String showFigures() {
        String result = "";
        for (Shape shape : shapes) {
            result += shape;
        }
        return result;
    }
}
