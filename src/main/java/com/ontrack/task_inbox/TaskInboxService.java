package com.ontrack.task_inbox;

import java.util.*;

public class TaskInboxService {

    public List<String> getTasks(String studentId) {
        if ("1234".equals(studentId)) {
            return Arrays.asList(
                "Task 1: Submitted",
                "Task 2: Feedback pending"
            );
        }
        return Collections.emptyList();
    }
}
