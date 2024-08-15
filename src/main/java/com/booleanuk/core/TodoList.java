package com.booleanuk.core;

import javafx.util.Pair;
import java.util.ArrayList;

public class TodoList {
    ArrayList<Pair<String, Boolean>> tasks = new ArrayList<>();

    public void addTask(String task){
        Pair<String, Boolean> newTask = new Pair<>(task, false);
        tasks.add(newTask);
    }

    public void markTask(String task){
        for (int i = 0; i < tasks.size(); i++) {
            Pair<String, Boolean> curTask = tasks.get(i);
            String curTaskString = curTask.getKey();
            if (curTaskString.equals(task)){
                boolean curMark = curTask.getValue();
                boolean newMark = !curMark;
                Pair<String, Boolean> newTask = new Pair<>(task, newMark);
                tasks.set(i, newTask);
                break;
            }
        }
    }

    public boolean checkTaskExists(String checkTask){
        for (Pair<String, Boolean> task: tasks){
            String taskString = task.getKey();
            if(taskString.equals(checkTask)){
                return true;
            }
        }
        return false;
    }

    public boolean removeTask(String task){
        for (int i = 0; i < tasks.size(); i++) {
            Pair<String, Boolean> curTask = tasks.get(i);
            String curTaskString = curTask.getKey();

            if(curTaskString.equals(task)){
                tasks.remove(i);
                return true;
            }
        }
        return false;
    }

    public String seeAllTasks(){
        for (Pair<String, Boolean> t: tasks){
            System.out.println(t);
        }
        return tasks.toString();
    }

    public String seeAllCompletedTasks(){
        ArrayList<Pair<String, Boolean>> completedList = new ArrayList<>();

        for(Pair<String, Boolean> t: tasks){
            boolean completed = t.getValue();
            if (completed){
                completedList.add(t);
                System.out.println(t);
            }
        }
        return completedList.toString();
    }

    public String seeAllIncompletedTasks(){
        ArrayList<Pair<String, Boolean>> notCompletedList = new ArrayList<>();

        for(Pair<String, Boolean> t: tasks){
            boolean notCompleted = !t.getValue();
            if (notCompleted){
                notCompletedList.add(t);
                System.out.println(t);
            }
        }
        return notCompletedList.toString();
    }
}





















