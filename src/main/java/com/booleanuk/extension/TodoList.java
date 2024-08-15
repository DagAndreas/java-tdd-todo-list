package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.HashMap;

public class TodoList  {
    HashMap<Integer, Task> tasks = new HashMap<>();

    public void addTask(int id, String task){
        Task newTask = new Task(task);
        tasks.put(id, newTask);
    }

    public void removeTask(int id){
        tasks.remove(id);
    }

    public HashMap<Integer, Task> seeAllTasks(){
        for(int i: tasks.keySet()){
            System.out.println(tasks.get(i));
        }
        return tasks;
    }


    public boolean markTaskById(int i){
        Task t = tasks.get(i);
        return t.mark();
    }


    // tested by TestTask
    public LocalDateTime getCreatedDate(int i){
        return tasks.get(i).getDate();
    }


}
