package com.booleanuk.extension;

import java.time.LocalDate;

public class Task {
    String task;
    boolean isMarked;
    LocalDate date;

    public Task(String task){
        this.task = task;
        this.isMarked = false;
        this.date = LocalDate.now();
    }

    public void setNewTaskName(String task){
        this.task = task;
    }


    public boolean isMarked(){
        return isMarked;
    }
}
