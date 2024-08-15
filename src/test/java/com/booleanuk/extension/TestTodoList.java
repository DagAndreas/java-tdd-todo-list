package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
