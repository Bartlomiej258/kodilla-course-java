package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private String whatToPaint;
    private boolean isTaskCompleted;

    public PaintingTask(String taskName, String whatToBuy, String whatToPaint) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        if (!(whatToBuy.isEmpty()) && !(whatToPaint.isEmpty())) {
            System.out.println("Executing task, I will buy: " + whatToBuy + " for paint " + whatToPaint);
            isTaskCompleted = true;
        } else {
            System.out.println("Task is not executed ");
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
