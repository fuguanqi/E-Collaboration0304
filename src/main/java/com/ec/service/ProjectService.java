package com.ec.service;
import com.ec.entity.Project;
import com.ec.mapper.ProjectMapper;
import com.ec.entity.Participate;

import java.util.List;

public interface ProjectService {
    int createProject(String studentName,String instructorName,String pTitle,String pDescription);
    int deleteProjectById(int projectId, int studentId);
    List<Project> displayProject(int studentId);
}
