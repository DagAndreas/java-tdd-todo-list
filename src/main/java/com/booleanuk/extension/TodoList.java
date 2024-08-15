package com.booleanuk.extension;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
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


    public String getTask(int id){
        try{
            return tasks.get(id).task;

        } catch (NullPointerException e){
            return null;
        }
    }

    public ArrayList<Task> listTasksAscendingOrder(){
        ArrayList<Task> taskList = new ArrayList<>(tasks.values());
        Collections.sort(taskList);

        for (Task t: taskList){
            System.out.println(t);
        }
        return taskList;
    }

    public ArrayList<Task> listTasksDescendingOrder(){
        ArrayList<Task> taskList = new ArrayList<>(tasks.values());
        Collections.sort(taskList);
        Collections.reverse(taskList);

        for (Task t: taskList){
            System.out.println(t);
        }
        return taskList;
    }





}
