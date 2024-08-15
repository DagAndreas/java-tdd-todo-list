package com.booleanuk.core;

import javafx.util.Pair;
import java.util.ArrayList;

public class TodoList {
    ArrayList<Pair<String, Boolean>> tasks = new ArrayList<>();

    public void addTask(String task){
        Pair<String, Boolean> newTask = new Pair<>(task, false);
        tasks.add(newTask);
    }
}
