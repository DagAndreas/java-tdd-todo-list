package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.AbstractMap.SimpleEntry;
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

        Assertions.assertTrue(todolist.tasks.contains(new SimpleEntry<>("Buy groceries", false)));
        Assertions.assertTrue(todolist.tasks.contains(new SimpleEntry<>("Take out the trash", false)));
        Assertions.assertFalse(todolist.tasks.contains(new SimpleEntry<>("Take in the trash", false)));
        Assertions.assertTrue(todolist.tasks.contains(new SimpleEntry<>("Wash car", false)));
        Assertions.assertFalse(todolist.tasks.contains(new SimpleEntry<>("Wash car again", false)));
    }

    @Test
    public void testMarkTask(){
        TodoList todolist = getTestingTodolist();
        String testString;
        boolean expected;

        testString = "Buy groceries";

        expected = false;
        Assertions.assertTrue(todolist.tasks.contains(new SimpleEntry<>(testString, expected)));
        todolist.markTask(testString);
        expected = true;
        Assertions.assertTrue(todolist.tasks.contains(new SimpleEntry<>(testString, expected)));
        todolist.markTask(testString);
        expected = false;
        Assertions.assertTrue(todolist.tasks.contains(new SimpleEntry<>(testString, expected)));

        testString = "Wash car";
        todolist.markTask(testString);
        expected = true;
        Assertions.assertTrue(todolist.tasks.contains(new SimpleEntry<>(testString, expected)));
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
        ArrayList<SimpleEntry<String, Boolean>> testTasks = new ArrayList<>();
        testTasks.add(new SimpleEntry<>("Buy groceries", false));
        testTasks.add(new SimpleEntry<>("Take out the trash", false));
        testTasks.add(new SimpleEntry<>("Wash car", false));

        Assertions.assertEquals(todoList.seeAllTasks(), testTasks.toString());

        todoList.markTask("Wash car");
        testTasks.set(2, new SimpleEntry<>("Wash car", true));
        Assertions.assertEquals(todoList.seeAllTasks(), testTasks.toString());
    }


    @Test
    public void testSeeAllCompleteTasks(){

        TodoList todoList = getTestingTodolist();
        ArrayList<SimpleEntry<String, Boolean>> testTasks = new ArrayList<>();
        testTasks.add(new SimpleEntry<>("Buy groceries", true));
        testTasks.add(new SimpleEntry<>("Wash car", true));

        todoList.markTask("Buy groceries");
        todoList.markTask("Wash car");

        Assertions.assertEquals(todoList.seeAllCompletedTasks(), testTasks.toString());
        todoList.markTask("Wash car");
        testTasks.remove(new SimpleEntry<>("Wash car", true));
        Assertions.assertEquals(todoList.seeAllCompletedTasks(), testTasks.toString());

    }

    @Test
    public void testSeeAllIncompleteTasks(){

        TodoList todoList = getTestingTodolist();
        ArrayList<SimpleEntry<String, Boolean>> testTasks = new ArrayList<>();
        testTasks.add(new SimpleEntry<>("Buy groceries", false));
        testTasks.add(new SimpleEntry<>("Take out the trash", false));
        testTasks.add(new SimpleEntry<>("Wash car", false));


        Assertions.assertEquals(todoList.seeAllIncompletedTasks(), testTasks.toString());
        todoList.markTask("Buy groceries");

        testTasks = new ArrayList<>();
        testTasks.add(new SimpleEntry<>("Take out the trash", false));
        testTasks.add(new SimpleEntry<>("Wash car", false));
        Assertions.assertEquals(todoList.seeAllIncompletedTasks(), testTasks.toString());
    }


    @Test
    public void testListTasksAscendingOrder(){
        TodoList todoList = new TodoList();
        todoList.addTask("Hang out the birthday flag");
        todoList.addTask("Buy groceries");
        todoList.addTask("Wash car");
        todoList.addTask("Take out the trash");

        ArrayList<SimpleEntry<String, Boolean>> testTasks = new ArrayList<>();
        testTasks.add(new SimpleEntry<>("Buy groceries", false));
        testTasks.add(new SimpleEntry<>("Hang out the birthday flag", false));
        testTasks.add(new SimpleEntry<>("Take out the trash", false));
        testTasks.add(new SimpleEntry<>("Wash car", false));


        Assertions.assertEquals(todoList.listTasksAscendingOrder(), testTasks.toString());

        todoList.addTask("A nice glass of juice");
        testTasks.add(0, new SimpleEntry<>("A nice glass of juice", false));
        Assertions.assertEquals(todoList.listTasksAscendingOrder(), testTasks.toString());

    }

    @Test
    public void testListTasksDescendingOrder(){
        TodoList todoList = new TodoList();
        todoList.addTask("Hang out the birthday flag");
        todoList.addTask("Buy groceries");
        todoList.addTask("Wash car");
        todoList.addTask("Take out the trash");

        ArrayList<SimpleEntry<String, Boolean>> testTasks = new ArrayList<>();
        testTasks.add(new SimpleEntry<>("Wash car", false));
        testTasks.add(new SimpleEntry<>("Take out the trash", false));
        testTasks.add(new SimpleEntry<>("Hang out the birthday flag", false));
        testTasks.add(new SimpleEntry<>("Buy groceries", false));


        Assertions.assertEquals(todoList.listTasksDescendingOrder(), testTasks.toString());

        todoList.addTask("A nice glass of juice");
        testTasks.add(testTasks.size(), new SimpleEntry<>("A nice glass of juice", false));
        Assertions.assertEquals(todoList.listTasksDescendingOrder(), testTasks.toString());
    }

}
































