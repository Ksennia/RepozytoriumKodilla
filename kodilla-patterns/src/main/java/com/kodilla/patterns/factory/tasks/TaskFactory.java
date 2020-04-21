package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING :
                return new DrivingTask("Driving", "California", "Tesla");
            case PAINTING :
                return new PaintingTask("Painting", "Yellow", "WarsawTawer");
            case SHOPPING :
                return new ShoppingTask("Shopping", "Medical Mask", 1200.0);
            default:
                return null;
        }
    }
}
