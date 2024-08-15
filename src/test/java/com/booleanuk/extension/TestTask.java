package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTask {
    @Test
    public void testCreateTask(){
        Task t = new Task("Test");
        Assertions.assertEquals(t.getClass().isHidden(), false);
    }

    @Test
    public void testSetNewTaskName(){
        Task task = new Task("Clean");
        Assertions.assertEquals(task.task, "Clean");
    }
}
