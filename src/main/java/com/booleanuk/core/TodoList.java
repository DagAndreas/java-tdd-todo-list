package com.booleanuk.core;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;



public class TodoList {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
    }

    ArrayList<SimpleEntry<String, Boolean>> tasks = new ArrayList<>();

    public void addTask(String task){
        SimpleEntry<String, Boolean> newTask = new SimpleEntry<>(task, false);
        tasks.add(newTask);
    }

    public void markTask(String task){
        for (int i = 0; i < tasks.size(); i++) {
            SimpleEntry<String, Boolean> curTask = tasks.get(i);
            String curTaskString = curTask.getKey();
            if (curTaskString.equals(task)){
                boolean curMark = curTask.getValue();
                boolean newMark = !curMark;
                SimpleEntry<String, Boolean> newTask = new SimpleEntry<>(task, newMark);
                tasks.set(i, newTask);
                break;
            }
        }
    }

    public boolean checkTaskExists(String checkTask){
        for (SimpleEntry<String, Boolean> task: tasks){
            String taskString = task.getKey();
            if(taskString.equals(checkTask)){
                return true;
            }
        }
        return false;
    }

    public boolean removeTask(String task){
        for (int i = 0; i < tasks.size(); i++) {
            SimpleEntry<String, Boolean> curTask = tasks.get(i);
            String curTaskString = curTask.getKey();

            if(curTaskString.equals(task)){
                tasks.remove(i);
                return true;
            }
        }
        return false;
    }

    public String seeAllTasks(){
        for (SimpleEntry<String, Boolean> t: tasks){
            System.out.println(t);
        }
        return tasks.toString();
    }

    public String seeAllCompletedTasks(){
        ArrayList<SimpleEntry<String, Boolean>> completedList = new ArrayList<>();

        for(SimpleEntry<String, Boolean> t: tasks){
            boolean completed = t.getValue();
            if (completed){
                completedList.add(t);
                System.out.println(t);
            }
        }
        return completedList.toString();
    }

    public String seeAllIncompletedTasks(){
        ArrayList<SimpleEntry<String, Boolean>> notCompletedList = new ArrayList<>();

        for(SimpleEntry<String, Boolean> t: tasks){
            boolean notCompleted = !t.getValue();
            if (notCompleted){
                notCompletedList.add(t);
                System.out.println(t);
            }
        }
        return notCompletedList.toString();
    }


    public String listTasksAscendingOrder() {
        List<SimpleEntry<String, Boolean>> sorted = tasks.stream()
                .sorted(Comparator.comparing(SimpleEntry::getKey))
                .toList();

        for(SimpleEntry<String, Boolean> t: sorted){
            System.out.println(t);
        }

        ArrayList<SimpleEntry<String, Boolean>> sortedArrayList = new ArrayList<>(sorted);
        System.out.println(sortedArrayList.toString());
        return sortedArrayList.toString();

    }

    public String listTasksDescendingOrder() {
        List<SimpleEntry<String, Boolean>> sorted = tasks.stream()
                .sorted(Comparator.comparing(SimpleEntry::getKey))
                .toList()
                .reversed();

        for(SimpleEntry<String, Boolean> t: sorted){
            System.out.println(t);
        }

        ArrayList<SimpleEntry<String, Boolean>> sortedArrayList = new ArrayList<>(sorted);
        System.out.println(sortedArrayList.toString());
        return sortedArrayList.toString();
    }

}





















