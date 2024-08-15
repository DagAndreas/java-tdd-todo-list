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

    @Test
    public void testAddTask(){
        TodoList todolist = new TodoList();

        todolist.addTask("Buy groceries");
        todolist.addTask("Take out the trash");
        todolist.addTask("Wash car");
        Assertions.assertTrue(todolist.tasks.contains(new Pair<>("Buy groceries", false)));
        Assertions.assertTrue(todolist.tasks.contains(new Pair<>("Take out the trash", false)));
        Assertions.assertFalse(todolist.tasks.contains(new Pair<>("Take in the trash", false)));
        Assertions.assertTrue(todolist.tasks.contains(new Pair<>("Wash car", false)));
        Assertions.assertFalse(todolist.tasks.contains(new Pair<>("Wash car again", false)));
    }

    public void testMarkTask(){

    }
}
