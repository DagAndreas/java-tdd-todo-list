package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

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

    @Test
    public void testLocalDate(){
        LocalDateTime ldt = LocalDateTime.now();
        Task task = new Task("Clean");

        // check if second is the same.
        Assertions.assertEquals(task.getDate().getSecond(), ldt.getSecond());
    }


}
