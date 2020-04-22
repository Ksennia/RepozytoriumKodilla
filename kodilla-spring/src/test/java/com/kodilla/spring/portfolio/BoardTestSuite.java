package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("TASK to do");
        board.getInProgressList().getTasks().add("TASK in progress");
        board.getDoneList().getTasks().add("TASK done");

        //Then
        Assert.assertEquals(board.getToDoList().getTasks().get(0), "TASK to do");
        Assert.assertEquals(board.getInProgressList().getTasks().get(0), "TASK in progress");
        Assert.assertEquals(board.getDoneList().getTasks().get(0), "TASK done");


    }
}
