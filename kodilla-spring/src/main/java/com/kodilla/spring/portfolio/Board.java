package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board() {
        this.toDoList = new TaskList();
        this.inProgressList =  new TaskList();
        this.doneList =  new TaskList();
    }

}
