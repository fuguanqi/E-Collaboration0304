package com.ec.service;

import com.ec.entity.Task;

import java.util.List;

public interface TaskService {
    int createTask(Integer studentId, Integer phaseId, String tTitle, String tDescription,String deadline);
    int deleteTask(Integer taskId, Integer leaderId);
    List<Task> display(Integer studentId);
    List<Task> display(Integer studentId, Integer projectId);
}
