package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testTaskFactoryShopping() {
        //given
        TaskFactory factory = new TaskFactory();

        //when
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();

        //Then
        assertEquals("shopping at weekend", shoppingTask.getTaskName());
        assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    void testTaskFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();

        //Then
        assertEquals("painting house", painting.getTaskName());
        assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    void testTaskFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();

        assertEquals(true, driving.isTaskExecuted());
        assertEquals("drive to work", driving.getTaskName());
    }
}
