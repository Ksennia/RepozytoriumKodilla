package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

     TaskList toDoList;
     TaskList inProgressList;

     TaskList doneList;

     @Bean
    public Board getBoard() {
         return new Board(toDoList, inProgressList, doneList);
     }
    @Bean
    public TaskList getToDoList() {
        return toDoList;
    }

    @Bean
    public TaskList getInProgressList() {
        return inProgressList;
    }

    @Bean
    public TaskList getDoneList() {
        return doneList;
    }
}
