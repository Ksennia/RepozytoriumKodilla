package com.kodilla.kodillapatterns2.observer.homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User implements Observer {
    private static final Logger LOGGER = LoggerFactory.getLogger(User.class);
    private String username;
    private int updateCount;

    public User(String mentorName) {
        this.username = mentorName;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        LOGGER.info("{}  done task {} ", username, homeworkQueue.getTasks());
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
