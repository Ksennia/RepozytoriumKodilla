package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkQueueTestSuite {
    @Test
    void testQueueUpdate() {
        //Given
        HomeworkQueue startJava = new StartJavaCourse();
        HomeworkQueue collections = new CollectionTopic();
        User lewandowski = new User("Lewandowski");
        User kubica = new User("Kubica");
        startJava.registerTask(lewandowski);
        startJava.registerTask(kubica);
        collections.registerTask(lewandowski);

        //When
        collections.addTask("Mentor add the Task Array List");
        collections.addTask("Mentor add the Task Linked List");
        startJava.addTask("Mentor add task Interface");
        startJava.addTask("Mentor add new task: Abstract class");

        //Then
        assertEquals(4, lewandowski.getUpdateCount());
        assertEquals(2, kubica.getUpdateCount());
    }
}
