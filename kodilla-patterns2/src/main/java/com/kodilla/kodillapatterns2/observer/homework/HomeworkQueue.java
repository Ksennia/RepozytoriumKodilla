package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements HomeworkObservableImpl{
    private final List<Observer> observers;
    private final List<String> tasks;
    private final String mentor;

    public HomeworkQueue(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.mentor = name;
    }
    public void addTask(String task) {
        tasks.add(task);
        notifyTask();
    }

    @Override
    public void registerTask(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void notifyTask() {
        for ( Observer observer : observers) {
            observer.update(this);
        }

    }

    @Override
    public void removeTask(Observer observer) {
        observers.remove(observer);

    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return mentor;
    }
}
