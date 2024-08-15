package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import javafx.util.Pair;


class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

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

        String testString = "Buy groceries";
        Assertions.assertTrue(todolist.tasks.contains(new Pair<>(testString, false)));
        todolist.markTask(testString);
        Assertions.assertTrue(todolist.tasks.contains(new Pair<>(testString, true)));

    }
}
