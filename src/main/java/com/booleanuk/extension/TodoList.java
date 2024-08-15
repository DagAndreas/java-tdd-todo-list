package com.booleanuk.extension;

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
}
