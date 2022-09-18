package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    TaskList taskToDoList;

    @Autowired
    @Qualifier("inProgressList")
    TaskList taskInProgressList;

    @Autowired
    @Qualifier("doneList")
    TaskList taskDoneList;

    @Bean
    public Board getBoard() {
        return new Board(taskToDoList, taskInProgressList, taskDoneList);
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }
}
