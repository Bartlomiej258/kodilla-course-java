package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("TDD: Testing Shape")
public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Test method addShape")
    class TestShapeMethod {

        @Test
        void shouldAddFigureToList() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(2);

            //When
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(square);
            int result = shapeCollector.getShapesQuantity();

            //Then
            Assertions.assertEquals(2, result);
        }

        @Test
        void shouldRemoveFigureNotExistFromList() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square(3);

            //When
            boolean result = shapeCollector.removeFigure(square);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void ShouldRemoveFigureFromList() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle(2, 3);
            shapeCollector.addFigure(triangle);

            //When
            boolean result = shapeCollector.removeFigure(triangle);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapesQuantity());
        }

        @Nested
        @DisplayName("Tests get index and print figure")
        class ShapePrinter {

            @Test
            void shouldGetFigureByIndex() {
                //Given
                ShapeCollector shapeCollector = new ShapeCollector();
                Circle circle = new Circle(2);
                Triangle triangle = new Triangle(1, 2);
                Square square = new Square(2);

                shapeCollector.addFigure(circle);
                shapeCollector.addFigure(triangle);
                shapeCollector.addFigure(square);

                //When
                Shape result = shapeCollector.getFigure(0);

                //Then
                Assertions.assertEquals(circle, result);
            }

            @Test
            void testShowFigure() {
                //Given
                ShapeCollector shapeCollector = new ShapeCollector();
                Circle circle = new Circle(2);
                Square square = new Square(3);
                Triangle triangle = new Triangle(2, 2);
                shapeCollector.addFigure(circle);
                shapeCollector.addFigure(square);
                shapeCollector.addFigure(triangle);

                //When
                String result = shapeCollector.showFigures();

                //Then
                Assertions.assertEquals("CircleSquareTriangle", result);
            }
        }
    }
}
