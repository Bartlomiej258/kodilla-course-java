package com.kodilla.kodilla.hibernate.task;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TASKS")
public class Task {

    private int id;
    private String descroption;
    private Date created;
    private int duration;

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
