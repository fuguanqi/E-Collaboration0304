package com.ec.service;
import com.ec.entity.Project;
import com.ec.mapper.ProjectMapper;
import com.ec.entity.Participate;

import java.util.List;

public interface ProjectService {
    int createProject(String studentName,String instructorName,String pTitle,String pDescription);
    int deleteProjectById(int projectId, int studentId);
    List<Participate> addTeammates(List<String> studentName,Integer projectId);
    List<Project> displayProject(int studentId);
    int repairProject(String pTitle,String pDescription);
}
