package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    private boolean isTaskCompleted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        if (!(where.isEmpty()) && !(using.isEmpty())) {
            System.out.println("Executing task, I go to: " + where + " with " + using);
            isTaskCompleted = true;
        } else {
            System.out.println("Task is not executed");
            isTaskCompleted = false;
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskCompleted;
    }
}
