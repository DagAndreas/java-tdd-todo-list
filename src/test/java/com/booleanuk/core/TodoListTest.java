package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import javafx.util.Pair;

import java.util.ArrayList;


class TodoListTest {

    public TodoList getTestingTodolist(){
        TodoList todolist = new TodoList();

        todolist.addTask("Buy groceries");
        todolist.addTask("Take out the trash");
        todolist.addTask("Wash car");
        return todolist;
    }

    @Test
    public void testAddTask(){
        TodoList todolist = getTestingTodolist();

        Assertions.assertTrue(todolist.tasks.contains(new Pair<>("Buy groceries", false)));
        Assertions.assertTrue(todolist.tasks.contains(new Pair<>("Take out the trash", false)));
        Assertions.assertFalse(todolist.tasks.contains(new Pair<>("Take in the trash", false)));
        Assertions.assertTrue(todolist.tasks.contains(new Pair<>("Wash car", false)));
        Assertions.assertFalse(todolist.tasks.contains(new Pair<>("Wash car again", false)));
    }

    @Test
    public void testMarkTask(){
        TodoList todolist = getTestingTodolist();
        String testString;
        boolean expected;

        testString = "Buy groceries";

        expected = false;
        Assertions.assertTrue(todolist.tasks.contains(new Pair<>(testString, expected)));
        todolist.markTask(testString);
        expected = true;
        Assertions.assertTrue(todolist.tasks.contains(new Pair<>(testString, expected)));
        todolist.markTask(testString);
        expected = false;
        Assertions.assertTrue(todolist.tasks.contains(new Pair<>(testString, expected)));

        testString = "Wash car";
        todolist.markTask(testString);
        expected = true;
        Assertions.assertTrue(todolist.tasks.contains(new Pair<>(testString, expected)));
    }



    @Test
    public void testCheckTaskExists(){
        TodoList todoList = getTestingTodolist();

        Assertions.assertTrue(todoList.checkTaskExists("Buy groceries"));
        Assertions.assertTrue(todoList.checkTaskExists("Take out the trash"));
        Assertions.assertTrue(todoList.checkTaskExists("Wash car"));


        Assertions.assertFalse(todoList.checkTaskExists("No task here"));
        Assertions.assertFalse(todoList.checkTaskExists("Washcar"));
    }

    @Test
    public void testRemoveTask(){
        TodoList todolist = getTestingTodolist();

        Assertions.assertTrue(todolist.checkTaskExists("Buy groceries"));
        Assertions.assertTrue(todolist.removeTask("Buy groceries"));
        Assertions.assertFalse(todolist.checkTaskExists("Buy groceries"));
        Assertions.assertFalse(todolist.removeTask("Buy groceries"));

    }

    @Test
    public void testSeeAllTasks(){
        TodoList todoList = getTestingTodolist();
        ArrayList<Pair<String, Boolean>> testTasks = new ArrayList<>();
        testTasks.add(new Pair<>("Buy groceries", false));
        testTasks.add(new Pair<>("Take out the trash", false));
        testTasks.add(new Pair<>("Wash car", false));

        Assertions.assertEquals(todoList.seeAllTasks(), testTasks.toString());

        todoList.markTask("Wash car");
        testTasks.set(2, new Pair<>("Wash car", true));
        Assertions.assertEquals(todoList.seeAllTasks(), testTasks.toString());



    }

}
































