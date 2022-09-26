package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";


    public Task makeTask(String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("shopping at weekend", "brood", 2);
            case PAINTING -> new PaintingTask("painting house", "yellow paint", "the wall");
            case DRIVING -> new DrivingTask("drive to work", "Warsaw", "a car");
            default -> null;
        };
    }

}
