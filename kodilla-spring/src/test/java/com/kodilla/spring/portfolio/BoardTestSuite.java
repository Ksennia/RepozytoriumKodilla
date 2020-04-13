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
        Board board1 = context.getBean(Board.class);
        //When
        board1.doneList.getTasks().add("DoneList");
        board1.getInProgressList().getTasks().add("InProgressList");
        board1.getToDoList().getTasks().add("ToDOList");
        String res = board1.doneList.getTasks().get(0);
        //Then
        Assert.assertEquals("DoneList", res);
    }
}
