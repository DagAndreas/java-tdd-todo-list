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
        task.setNewTaskName("Clean up");
        Assertions.assertEquals(task.task, "Clean up");
        Assertions.assertNotEquals(task.task, "Clean");
    }

    @Test
    public void testisMarked(){
        Task task = new Task("Clean");

        Assertions.assertFalse(task.isMarked());
        task.isMarked = true;
        Assertions.assertTrue(task.isMarked());
    }

    @Test
    public void testMark(){
        Task task = new Task("Clean");

        Assertions.assertFalse(task.isMarked);
        Assertions.assertTrue(task.mark());
        Assertions.assertTrue(task.isMarked);

        task.mark();
        Assertions.assertFalse(task.isMarked);
    }


}
