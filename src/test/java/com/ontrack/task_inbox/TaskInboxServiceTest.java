package com.ontrack.task_inbox;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class TaskInboxServiceTest {

    @Test
    public void testInboxForStudent1234_returnsExpectedTasks() {
        // Arrange
        TaskInboxService service = new TaskInboxService();
        System.out.println("Creating TaskInboxService...");

        // Act
        List<String> inbox = service.getTasks("1234");
        System.out.println("Retrieved inbox for student 1234: " + inbox);

        // Assert
        assertNotNull(inbox, "Inbox should not be null");
        assertEquals(3, inbox.size(), "Intentional fail to trigger CI");

        assertTrue(inbox.get(0).contains("Submitted"), "First task should indicate submission");
        assertTrue(inbox.get(1).contains("Feedback pending"), "Second task should show feedback status");
    }
}
