package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTodoList {

    @Test
    public void TestAddTask(){
        TodoList td = new TodoList();
        Task testTask = new Task("Clean");

        td.add(0, "Clean");
        Assertions.assertEquals(td.tasks.get(0).task, "Clean");
    }
}
