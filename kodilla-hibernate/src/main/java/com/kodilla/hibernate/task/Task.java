package com.kodilla.hibernate.task;

import com.kodilla.hibernate.tasklist.TaskList;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@NamedQueries({
        @NamedQuery(
                name = "Task.retrieveLongTasks",
                query = "FROM Task WHERE duration > 10"
        ),
        @NamedQuery(name = "Task.retrieveShortTasks",
                query = "FROM Task WHERE duration <= 10"
        ),
        @NamedQuery(name = "Task.retrieveTasksWithDurationLongerThan",
        query = "FROM Task where duration > :DURATION"
        )
})
@NamedNativeQuery(
        name = "Task.retrieveTasksWithEnoughTime",
        query = "SELECT * FROM TASKS" +
                " WHERE DATEDIFF(DATE_ADD(CREATED, INTERVAL DURATION DAY), NOW()) > 5",
        resultClass = Task.class)
@Entity
@Table(name = "TASKS")
public class Task {

    private int id;
    private String descroption;
    private Date created;
    private int duration;
    private TaskFinancialDetails taskFinancialDetails;
    private TaskList taskList;

    public Task() {
    }

    public Task(String descroption, int duration) {
        this.descroption = descroption;
        this.created = new Date();
        this.duration = duration;
    }

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "DESCRIPTION")
    public String getDescroption() {
        return descroption;
    }

    @NotNull
    @Column(name = "CREATED")
    public Date getCreated() {
        return created;
    }

    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "TASKS_FINANCIALS_ID")
    public TaskFinancialDetails getTaskFinancialDetails() {
        return taskFinancialDetails;
    }

    @ManyToOne
    @JoinColumn(name = "TASKLIST_ID")
    public TaskList getTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }

    public void setTaskFinancialDetails(TaskFinancialDetails taskFinancialDetails) {
        this.taskFinancialDetails = taskFinancialDetails;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setDescroption(String descroption) {
        this.descroption = descroption;
    }

    private void setCreated(Date created) {
        this.created = created;
    }

    private void setDuration(int duration) {
        this.duration = duration;
    }
}
