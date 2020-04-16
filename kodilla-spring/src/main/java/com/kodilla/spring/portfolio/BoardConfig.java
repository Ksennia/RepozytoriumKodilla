package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {


    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList getListToDo() {return toDoList;}

    @Bean( name = "InProgress")
    @Scope("prototype")
    public TaskList getInProgress() {return inProgressList;}

    @Bean( name = "done")
    @Scope("prototype")
    public TaskList getDone() { return doneList;}


}
