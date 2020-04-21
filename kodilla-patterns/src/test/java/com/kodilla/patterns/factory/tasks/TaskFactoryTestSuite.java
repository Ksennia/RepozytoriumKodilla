package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task driving = task.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Driving", driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting () {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task painting = task.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting", painting.getTaskName());
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task shopping = task.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopping", shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
    }
}
