package com.kodilla.patterns.factory.tasks;

public class DrivingTask {
    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
}
