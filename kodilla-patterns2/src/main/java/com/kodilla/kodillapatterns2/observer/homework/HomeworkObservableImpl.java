package com.kodilla.kodillapatterns2.observer.homework;

public interface HomeworkObservableImpl {
    void registerTask(Observer observer);
    void notifyTask ();
    void removeTask(Observer observer);
}
