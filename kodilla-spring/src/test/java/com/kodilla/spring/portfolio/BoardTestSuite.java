package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.doneList = new TaskList();
        board.inProgressList = new TaskList();
        board.toDoList = new TaskList();

        //When

        board.doneList.getTasks().add("DoneList");
        board.inProgressList.getTasks().add("InProgressList");
        board.toDoList.getTasks().add("ToDoList");

        String res = board.doneList.getTasks().get(0);
        String res1 = board.inProgressList.getTasks().get(0);
        String res2 = board.toDoList.getTasks().get(0);

        //Then
        Assert.assertEquals("DoneList", res);
        Assert.assertEquals("InProgressList", res1);
        Assert.assertEquals("ToDoList", res2);
    }
}
