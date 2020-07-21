package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.Date;
import java.util.List;

@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task, Integer> {

    List<Task> findByDuration(int duration);
    List<Task> findByDescriptionAndCreated(String description, Date created);

    @Query
    List<Task> retrieveLongTasks();

    @Query
    List<Task> retrieveShortTasks();

    @Query(nativeQuery = true)
    List<Task> retrieveTasksWithEnoughtTime();

    @Query
    List<Task> retrieveTaskWithDurationLongerThan (@Param("DURATION") int duration);
}
