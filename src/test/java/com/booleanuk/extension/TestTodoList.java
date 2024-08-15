package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestTodoList {

    @Test
    public void TestAddTask(){
        TodoList td = new TodoList();
        Task testTask = new Task("Clean");

        td.addTask(0, "Clean");
        Assertions.assertEquals(td.tasks.get(0).task, "Clean");
    }

    @Test
    public void TestRemoveTask(){
        TodoList td = new TodoList();
        td.addTask(0, "Clean");
        td.addTask(1, "Bake cake");

        Assertions.assertEquals(td.tasks.get(0).task, "Clean");
        td.removeTask(0);
        Assertions.assertNull(td.tasks.get(0));


        Assertions.assertEquals(td.tasks.get(1).task, "Bake cake");
        td.removeTask(1);
        Assertions.assertNull(td.tasks.get(1));

    }


    @Test
    public void testSeeAllTasks(){
        TodoList td = new TodoList();
        td.addTask(0, "Clean");
        td.addTask(1, "Wash car");
        td.addTask(2, "Clean again");

        ArrayList<String> expectedResults = new ArrayList<>();
        expectedResults.add("Clean"); expectedResults.add("Clean again"); expectedResults.add("Wash car");
        int correctCounter = 0;
        HashMap<Integer, Task> gottenResults = td.seeAllTasks();
        for (Task task: gottenResults.values()){
            boolean containedInExpectedResults = expectedResults.contains(task.task);
            Assertions.assertTrue(containedInExpectedResults);
            correctCounter++;
        }

        Assertions.assertEquals(correctCounter, expectedResults.size());
    }

    @Test
    public void testMarkTaskById(){
        TodoList td = new TodoList();
        td.addTask(0, "Clean");
        td.addTask(1, "Wash car");
        td.addTask(2, "Clean again");


        Assertions.assertFalse(td.tasks.get(0).isMarked);
        td.markTaskById(0);
        Assertions.assertTrue(td.tasks.get(0).isMarked);
    }


    @Test
    public void testGetTaskById(){
        TodoList td = new TodoList();
        td.addTask(0, "Clean");
        td.addTask(1, "Wash car");
        td.addTask(2, "Clean again");

        Assertions.assertEquals(td.getTask(0), "Clean");
        Assertions.assertEquals(td.getTask(1), "Wash car");
        Assertions.assertEquals(td.getTask(2), "Clean again");
        Assertions.assertNotEquals(td.getTask(4), "Clean again");



    }


}
