package com.booleanuk.extension;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class Task {
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

    public LocalDateTime getDate(){
        System.out.println(date.getDayOfMonth() + ", " + date.getMonth() + "-" + date.getYear());
        return date;
    }
}
