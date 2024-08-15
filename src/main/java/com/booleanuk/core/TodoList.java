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
}
