package com.booleanuk.extension;

import java.util.HashMap;

public class TodoList  {
    HashMap<Integer, Task> tasks = new HashMap<>();

    public void add(int id, String task){
        Task newTask = new Task(task);
        tasks.put(id, newTask);
    }
}
