package com.booleanuk.extension;

import java.time.LocalDateTime;

public class Task implements Comparable<Task>{
    String task;
    boolean isMarked;
    LocalDateTime date;

    public Task(String task){
        this.task = task;
        this.isMarked = false;
        this.date = LocalDateTime.now();
    }

    public void setNewTaskName(String task){
        this.task = task;
    }


    public boolean isMarked(){
        return isMarked;
    }

    public boolean mark(){
        isMarked = !isMarked;
        return isMarked;
    }


    public String returnDateString() {
        return date.getDayOfMonth() + ", " + date.getMonth() + "-" + date.getYear();
    }

    public LocalDateTime getDate(){
        System.out.println(returnDateString());
        return date;
    }

    @Override
    public String toString(){
        return "Task:" + task + "\t| status:" + isMarked + "\t| date: " + returnDateString();
    }

    @Override
    public int compareTo(Task task) {
        return this.task.compareTo(task.task);
    }
}
