package com.booleanuk.extension;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
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
}
