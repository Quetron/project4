package com.company;

public class Tasks {
    private String taskTitle;
    private String taskDescription;
    private Integer taskPriority;

    public Tasks(String taskTitle, String taskDescription, Integer taskPriority) {
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.taskPriority = taskPriority;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Integer getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(Integer taskPriority) {
        this.taskPriority = taskPriority;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "taskTitle='" + taskTitle + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskPriority=" + taskPriority +
                '}';
    }
}
